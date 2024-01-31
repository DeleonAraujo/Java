package animais;

public abstract class Animal {

    private String raca, cor;
    private char sexo;
    private float peso;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
       public boolean comer(int qtd){
           if(qtd >=5){
               return true;
           }else if(qtd < 5){
               return false;
           }
           return false;
       }
       
       public abstract void andar();
       
       public abstract void brincar();
}
