package operacoes;

import javax.swing.JOptionPane;
import operacoesbasicas.Somar;

public class Multiplicar {

    protected final float PI = 3.1416f;
    public static final int CONSTATE = 1;

    public double MultiplicarComPI(double valor){
        return valor*PI;
    }

    public void SomarEMultiplicar(){
        Somar s = new Somar();
        
        /*JOptionPane.showMessageDialog(null, "O valor da soma de dois doubles é: " +
                s.somarDoisDoubles(2.4, 2.6));     */
        
        JOptionPane.showMessageDialog(null, "O valor da soma de dois inteiros é: "+ 
                s.somarDoisInteiros(CONSTATE));
    }
}
