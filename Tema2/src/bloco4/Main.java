package bloco4;

import java.util.function.Function;

public class Main {
	
	public static void main(String... args) {
		
		Function<Integer, Integer> f = x -> x + 1;
		Function<Integer, Integer> g = x -> x * 2;
		
		Function<Integer, Integer> h1 = f.andThen(g);
		System.out.println("andThen");
		System.out.println(h1.apply(11));
		System.out.println(h1.apply(22));
		System.out.println(h1.apply(33));
		
		Function<Integer, Integer> h2 = f.compose(g);
		System.out.println("compose");
		System.out.println(h2.apply(11));
		System.out.println(h2.apply(22));
		System.out.println(h2.apply(33));
		
	}

}
