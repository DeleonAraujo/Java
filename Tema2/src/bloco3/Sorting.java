package bloco3;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {

	
	/*criado uma lista com 3 maças*/
	public static void main(String... args) {
		List<Apple> inventory = new ArrayList<>();
		inventory.addAll(Arrays.asList(
			new Apple(80, Color.GREEN),
			new Apple(155, Color.GREEN),
			new Apple(120, Color.RED),
			new Apple(300, Color.GREEN)
		));
		
		//é realizado a ordenação das maças pelo peso e impresso no terminal usando Comparator
		inventory.sort(new AppleComparator());
		System.out.println("1. " + inventory);
		
		//alteração do peso da primeira maça
		inventory.set(1, new Apple(30, Color.GREEN));
		
		//realizado uma nova ordemação e impressão mo terminal usando uma classe anonima
		inventory.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight() - a2.getWeight();
			}
		});
		System.out.println("2. " + inventory);
		
		//alteração do peso e cor da primeira maça
		inventory.set(1, new Apple(20, Color.RED));
		
		//realizado a ordenação e impressão no terminal usando uma expressão Lambda
		inventory.sort((a1, a2) -> a1.getWeight() - a2.getWeight());
        System.out.println("3. " + inventory);

        //alteração do peso da primeira maçã
        inventory.set(1, new Apple(10, Color.RED));
        
        //ordenação e impressão no terminal usando metodo de referencia
        inventory.sort(comparing(Apple::getWeight));
        System.out.println("4. " + inventory);
    }
    
	static class AppleComparator implements Comparator<Apple>{

		@Override
		public int compare(Apple a1, Apple a2) {
			return a1.getWeight() - a2.getWeight();
		}
		
	}

}
