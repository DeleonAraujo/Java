package aspirador;

public class Aspirador {

    private String cor;
    private String modelo;
    private String tipoLimpeza;
    private String voltagem;
    private boolean bateria;

    public boolean isBateria() {
        return bateria;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoLimpeza() {
        return tipoLimpeza;
    }

    public void setTipoLimpeza(String tipoLimpeza) {
        this.tipoLimpeza = tipoLimpeza;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }
    
    public boolean desligar(){
        System.out.println("Aparelho desligado!");
        return false;
    }

    public boolean ligar(){
        System.out.println("Aparelho ligado!");
        return true;
    }
    
    private boolean verificarBateria(){
        return true;
    }
}