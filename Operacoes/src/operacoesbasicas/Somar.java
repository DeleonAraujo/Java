package operacoesbasicas;

public class Somar {
    
    private int valor1;

    public Somar(int valor1){
        this.valor1 = valor1;
    }

    public Somar(){
    }

    public int somarDoisInteiros(int valor2){
        return(this.valor1 + valor2);
    }

    protected double somarDoisDoubles(double valor1, double valor2){
        return (valor1 + valor2);
    }
}