package bloco2;

import java.awt.Color;

public class Apple {
    
    private int weight = 0;
    private Color color;
    
    //metodo construtor
    public Apple(int weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public java.awt.Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return String.format("Apple{color=%s, weight=%d}", color, weight);
    }
    
}