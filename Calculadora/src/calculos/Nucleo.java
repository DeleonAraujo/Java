package calculos;

import javax.swing.JOptionPane;

public class Nucleo extends Impressao implements IBase{

    @Override
    public double Soma(double a, double b) {
        return a+b;
    }

    @Override
    public double Subtracao(double a, double b) {
        return a-b;
    }

    @Override
    public double Divisao(double a, double b) {
        return a/b;
    }

    @Override
    public double Multiplicacao(double a, double b) {
        return a*b;
    }
    
    @Override
    public void imprimirResultado() {
        //TODO
    }
    
    public void calcular(){
        double a = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro número:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Entre com o segundo número:"));
        
        Object[] op = {"Soma", "Subtração", "Multiplicação", "Divisão"};
        
        String tipo = (String) JOptionPane.showInputDialog(null, "Selecione o calculo: \n",
                "Pesquisa", JOptionPane.PLAIN_MESSAGE, null, op, "Soma");
        
        switch(tipo){
            case "Soma": {
                JOptionPane.showMessageDialog(null, "O resultado da soma é: "+this.Soma(a, b));
                break;
            }
            case "Subtração": {
                JOptionPane.showMessageDialog(null, "O resultado da subtraçao é: "+this.Subtracao(a, b));
                break;
            }
            case "Multiplicação": {
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: "+this.Multiplicacao(a, b));
                break;
            }
            case "Divisão": {
                JOptionPane.showMessageDialog(null, "O resultado da divisão é: "+this.Divisao(a, b));
                break;
            }
            default: 
                throw new IllegalArgumentException("Valor inválido");
        }
    }
    
}
