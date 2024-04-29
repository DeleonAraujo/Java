package bloco2;

import java.util.Comparator;

public abstract class AppleComparator implements Comparator<Apple>{

    @Override
    public int compare(Apple a1, Apple a2) {
        return a1.getWeight() - a2.getWeight();
    }
    
}