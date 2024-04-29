package bloco2;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.comparing;

public class Main {
    
    public static void main(String[] args) {
        /*comparação tradicional, com a classe java.util.Comparator
        Comparator<Apple> byWeight1 = new Comparator<Apple>() {
            public int compareTo(Apple a1, Apple a2) {
                return a1.getWeight() - a2.getWeight();
            }
        };*/
        
        //Expressão Lambda
        Comparator<Apple> byWeight2 = (Apple a1, Apple a2) -> a1.getWeight() - a2.getWeight();

        //Filtragem de maças com expressão Lambda
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED)
        );

        List<Apple> greenApples = filter(inventory, (Apple a) -> a.getColor() == Color.GREEN);
            System.out.println("1. " + greenApples);

        inventory.sort(new AppleComparator());
            System.out.println("2. " + inventory);

        inventory.set(1, new Apple(130, Color.GREEN));

        inventory.sort(new AppleComparator<Apple>(){

            @Override
            public int compare(Apple a1, Apple a2){
                return a1.getWeight() - a2.getWeight();
            }
        });

        System.out.println("3. " + inventory);

        inventory.set(1, new Apple(20, Color.RED));

        inventory.sort((a1, a2) -> a1.getWeight() - a2.getWeight());
        System.out.println("4. " + inventory);


        inventory.set(1, new Apple(10, Color.RED));

        inventory.sort(comparing(Apple::getWeight));
        System.out.println("5. " + inventory);
    }
    
    public static List<Apple> filter(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
