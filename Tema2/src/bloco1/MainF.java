package bloco1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MainF {
	
	public static <T, R> List<R> map(List<T> list, Function<T, R> f){
		List<R> result = new ArrayList<>();
		for(T t: list) {
			result.add(f.apply(t));
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		List<Integer> l = map(
				Arrays.asList("expressões", "lambda", "e", "interface", "funcionais", ""),
				(String s) -> s.length());
		System.out.println(l);
	}

}
