package bloco4;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.reducing;
import static java.util.stream.Collectors.summarizingInt;
import static java.util.stream.Collectors.summingInt;

import java.util.IntSummaryStatistics;

import bloco4.common.Dish;
import static bloco4.common.Dish.menu;

public class Summarizing {
	
	public static void main(String[] args) {
		
		System.out.println("1. Nùmero de pratos: " + howManyDishes());
		System.out.println("2. O prato mais calórico é: " + findMostCaloricDish());
		System.out.println("3. O total de calorias do menu é: " + calculateTotalCalories());
		System.out.println("4. A média de calorias do menu é: " + calculateAverageCalories());
		System.out.println("5. Estatística do menu: " + calculateMenuStatistic());
		System.out.println("6. Resumo do menu: " + getShortMenuCommaSeparated());
	}

	private static long howManyDishes() {
		return menu.stream().collect(counting());
	}
	
	private static Dish findMostCaloricDish() {
		return menu.stream().collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2)).get();
	}
	
	private static int calculateTotalCalories() {
		return menu.stream().collect(summingInt(Dish::getCalories));
	}
	
	private static Double calculateAverageCalories() {
		return menu.stream().collect(averagingInt(Dish::getCalories));
	}
	
	private static IntSummaryStatistics calculateMenuStatistic() {
		return menu.stream().collect(summarizingInt(Dish::getCalories));
	}
	
	private static String getShortMenuCommaSeparated() {
		return menu.stream().map(Dish::getName).collect(joining(", "));
	}

}
