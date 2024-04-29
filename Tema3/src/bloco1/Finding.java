package bloco1;

import static bloco1.common.Dish.menu;
import java.util.Optional;
import bloco1.common.Dish;

public class Finding {
	
	public static void main(String... args) {
		
		if(isVegetarianFriendlyMenu()) {
			System.out.println("Vegetarian Friendly");
		}		
		System.out.println(isHealthyMenu());
		System.out.println(isHealthyMenu2());
		
		Optional<Dish> dish = findVegetarianDish();
		dish.ifPresent(d -> System.out.println(d.getName()));	
	}
	
	//busca qaulquer prato que seja vegetariano
	private static boolean isVegetarianFriendlyMenu(){
		return menu.stream().anyMatch(Dish::isVegetarian);
	}
	
	//busca no cardapio se existem pratos que tem menos de 1000 calorias
	private static boolean isHealthyMenu() {
		return menu.stream().allMatch(d -> d.getCalories() < 1000);
	}
	
	//busca no cardapio de existems pratos que tem 1000 ou mais calorias
	private static boolean isHealthyMenu2() {
		return menu.stream().noneMatch(d -> d.getCalories() >= 1000);		
	}
	
	//busca os pratos que são vegetarianos
	private static Optional<Dish> findVegetarianDish(){
		return menu.stream().filter(Dish::isVegetarian).findAny();
	}

}
