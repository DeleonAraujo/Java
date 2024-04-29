package bloco1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MainC {
	
	public static <T> void forEach(List<T> list, Consumer<T> c) {
		for(T t: list) {
			if(((Integer)t).intValue()%2 ==0)
				c.accept(t);
		}
	}
	
	public static void main(String[] args) {
		forEach(Arrays.asList(1, 2, 3, 4, 5, 6), (Integer i) -> System.out.println(i));
	}

}
