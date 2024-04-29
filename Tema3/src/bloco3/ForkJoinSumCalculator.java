package bloco3;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinTask;
import java.util.function.Function;
import java.util.stream.LongStream;

public class ForkJoinSumCalculator extends RecursiveTask<Long>{
	
	public static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
	public static final long THRESHOLD = 10_000;
	private final long[] numbers;
	private final int start;
	private final int end;
	private static final long serialVersionUID = 1L; 

	//metodos contrutores
	public ForkJoinSumCalculator(long[] numbers) {
		this(numbers, 0, numbers.length);
	}
		
	private ForkJoinSumCalculator(long[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}
	
	public static void main(String... args) {
		System.out.println("ForkJoin sum done is:" + measurePerf(ForkJoinSumCalculator::forkJoinSum, 10_000_000L) + "msecs");
	}
	
	public static<T, R> long measurePerf(Function<T, R> f, T input) {
		long fastest = Long.MAX_VALUE;
		for(int i = 0; i < 10; i ++) {
			long start = System.nanoTime();
			R result = f.apply(input);
			long duration = (System.nanoTime() - start) / 10_000_000;
			System.out.println("Result: " + result);
			if(duration < fastest) {
				fastest = duration;
			}
		}
		return fastest;
	}
	
	public static long forkJoinSum(long n) {
		long[] numbers = LongStream.rangeClosed(1, n).toArray();
		ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
		return FORK_JOIN_POOL.invoke(task);
	}

	@Override
	protected Long compute() {
		int lenght = end - start;
		if(lenght <= THRESHOLD) {
			return computeSequentially();
		}
		ForkJoinSumCalculator leafTask = new ForkJoinSumCalculator(numbers, start, start + lenght / 2);
		leafTask.fork();
		ForkJoinSumCalculator rightTask = new ForkJoinSumCalculator(numbers, start + lenght / 2, end);
		Long rightResult = rightTask.compute();
		Long leftResult = leafTask.join();
		return leftResult + rightResult;
	}
	
	private long computeSequentially() {
		long sum = 0;
		for(int i = start; i < end; i ++) {
			sum +=numbers[i];
		}
		return sum;
	}

}
