package bloco1;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            
            if(Color.GREEN.equals(apple.getColor())){
                result.add(apple);
            }      
        }
        return result;
    }
    
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        
        for(Apple apple: inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Apple> warehouse = new ArrayList<Apple>();
        warehouse.add(new Apple(100, Color.RED));
        warehouse.add(new Apple(200, Color.RED));
        warehouse.add(new Apple(100, Color.GREEN));
        warehouse.add(new Apple(200, Color.GREEN));
        
        ApplePredicate greenApples = new AppleGreenColorPredicate();
        ApplePredicate redAndHeavyApples = new AppleRedAndHeavyPredicate();
        
        List<Apple> apples = filterApples(warehouse, greenApples);
        System.out.println(apples);
    }
    
}
