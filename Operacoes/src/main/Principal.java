package main;

import java.text.DecimalFormat;
import operacoes.Dividir;
import operacoes.Multiplicar;
import operacoesbasicas.Somar;
import operacoesbasicas.SomarSubtrair;

public class Principal {
    
    public static void main(String[] args) {
        Somar s = new Somar();
        Somar sn = new Somar();
        SomarSubtrair ss = new SomarSubtrair();
        Dividir d = new Dividir();
        Multiplicar m = new Multiplicar();

        DecimalFormat formatacao = new DecimalFormat();
        formatacao.applyPattern("0,00");
        //se utilizar #,## valores zero serão ocultados

        System.out.println("O resultado da soma de dois inteiros (constante =1):" +
                s.somarDoisInteiros(Multiplicar.CONSTATE));
        System.out.println("O resultado da soma de dois inteiros: "+
                s.somarDoisInteiros(2));
        System.out.println("O resultado da soma de dois inteiros (método construtor recebeu 3):" +
                sn.somarDoisInteiros(2));

        ss.SomarSubtrair();

        System.out.println("Resultado da divisão: " +d.DividirNumeros(2.4e2, 2.4e2));
        System.out.println("Resultado da multiplicação por PI: " +
                formatacao.format(m.MultiplicarComPI(1.0e2)));
        m.SomarEMultiplicar();
    }
}
