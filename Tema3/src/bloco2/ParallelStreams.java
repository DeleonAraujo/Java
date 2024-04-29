package bloco2;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelStreams {
	
	public static void main(String... args) {
		System.out.println("Soma iterativa: " + interativeSum(10L));
		System.out.println("Soma sequencial: " + sequentialSum(10L));
		System.out.println("Soma paralela: " + parallelSum(10L));
	}

	public static long interativeSum(long n) {
		long result = 0;
		for(long i = 0; i<= n; i++) {
			result += i;
		}
		return result;
	}
	
	public static long sequentialSum(long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).reduce(Long::sum).get();
	}
	
	public static long parallelSum(long n) {
		return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(Long::sum).get();
	}
	
	public static long sideEffectParallelSum(long n) {
		Accumullator accumullator = new Accumullator();
		LongStream.rangeClosed(1, n).parallel().forEach(accumullator::add);
		return accumullator.total;
	}
	
	public static class Accumullator {
		private long total = 0;
		
		public void add(long value) {
			total +=value;
		}
	}

}
