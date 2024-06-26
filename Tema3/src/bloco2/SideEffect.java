package bloco2;

import java.util.function.Function;

public class SideEffect {
	
	public static void main(String[] args) {
		System.out.println("SideEffect parallel sum done in: " 
				+ measurePerf(ParallelStreams::sideEffectParallelSum, 100L) + "msecs");
	}
	
	public static<T, R> long measurePerf(Function<T, R> f, T input) {
		long fastest = Long.MAX_VALUE;
		for(int i = 0; i < 10; i++) {
			long start = System.nanoTime();
			R result = f.apply(input);
			long duration = (System.nanoTime() - start) / 1_000_000;
			System.out.println("Resultado" + result);
			if(duration < fastest) {
				fastest = duration;
			}
		}
		return fastest;
	}
}
