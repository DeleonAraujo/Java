package aspirador;

public class Principal {

    public static void main(String[] args) {
        
        Robo r = new Robo();
        Vertical v = new Vertical();

        System.out.println("A cor do aspirador é:" +r.getCor());
        System.out.println("O modelo do aspirador é:" +r.getModelo());
        r.ligar();
        r.desligar();

        v.setCor("Azul");
        v.setModelo("Arnold");
        v.ligar();
        v.desligar();
        v.verificarBateria();
    }
    
}
