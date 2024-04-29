package bloco1;

import static java.util.stream.Collectors.toList;
import static bloco1.common.Dish.menu;
import java.util.Arrays;
import java.util.List;

import bloco1.common.Dish;

public class Filtering {
	
	public static void main(String... args) {
		System.out.println("Filtragem por predicado");
		List<Dish> vegetarianMenu = menu.stream().filter(Dish::isVegetarian).collect(toList());
		vegetarianMenu.forEach(System.out::println);
		
		System.out.println("Filtragem com elementos unicos");
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream().filter(i -> i % 2 == 0).distinct().forEach(System.out::println);
		
		List<Dish> specialMenu = Arrays.asList(
			new Dish("season fruit", true, 120, Dish.Type.OTHER),
			new Dish("prawns", false, 300, Dish.Type.FISH),
			new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER)
		);
		
		System.out.println("\n *************Menu ordenado:");
		List<Dish> filteredMenu = specialMenu.stream().filter(dish -> dish.getCalories() < 320).collect(toList());
		filteredMenu.forEach(System.out::println);
		
		//exibe somente os elementos com menos de 320 calorias
		System.out.println("\n********Ordenado e dividido por takeWhile");
		List<Dish> slicedMenu1 = specialMenu.stream().takeWhile(dish -> dish.getCalories() < 320).collect(toList());
		slicedMenu1.forEach(System.out::println);
		
		//retira os elementos com menos de 320 calorias
		System.out.println("\n********Ordenado e dividido por takeWhile");
		List<Dish> slicedMenu2 = specialMenu.stream().dropWhile(dish -> dish.getCalories() < 320).collect(toList());
		slicedMenu2.forEach(System.out::println);
		
		List<Dish> dishesLimit3 = menu.stream().filter(d -> d.getCalories() > 300).limit(3).collect(toList());
		System.out.println("\n Truncagem de um Stream");
		dishesLimit3.forEach(System.out::println);
				
	}
}
