package main;

import animais.Cachorro;
import animais.Gato;

public class Principal {
    
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();
        Gato g = new Gato();
        
        c.andar();
        g.ronronar();
        
    }   
    
}
