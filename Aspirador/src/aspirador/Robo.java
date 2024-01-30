package aspirador;

public class Robo extends Aspirador {

    private String tipoAplicativo;
    private String tipoControle;

    public Robo(){
        super.setCor("Vermelho");
        super.setModelo("Zyon");
        super.setBateria(true);
        super.setTipoLimpeza("A seco");
        super.setVoltagem("220 Voltz");
        this.tipoAplicativo = "Android";
        this.tipoControle = "Por aplicativo apenas";
    }

    public String getTipoAplicativo() {
        return tipoAplicativo;
    }

    public void setTipoAplicativo(String tipoAplicativo) {
        this.tipoAplicativo = tipoAplicativo;
    }

    public String getTipoControle() {
        return tipoControle;
    }

    public void setTipoControle(String tipoControle) {
        this.tipoControle = tipoControle;
    }

    public void mapear(){
        System.out.println("Mapeando Ambiente");
    }

    public void voltarBase(){
        if (this.verificarBateria()) {
            System.out.println("Voltando a base!");
        }else{
            System.out.println("Não é possível voltar a base, a bateria está fraca!");
        }
    }

    public boolean ativarSensorColisao(){
        return true;
    }

    @Override
    public boolean verificarBateria(){
        if (super.isBateria()) {
            return true;
        }else{
            return false;
        }
    }
}
