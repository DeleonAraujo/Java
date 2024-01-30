package aspirador;

public class Vertical extends Aspirador{

    private boolean hasteAjustavel;
    private float tamanhoCabo;

    public boolean isHasteAjustavel() {
        return hasteAjustavel;
    }
    public void setHasteAjustavel(boolean hasteAjustavel) {
        this.hasteAjustavel = hasteAjustavel;
    }
    public float getTamanhoCabo() {
        return tamanhoCabo;
    }
    public void setTamanhoCabo(float tamanhoCabo) {
        this.tamanhoCabo = tamanhoCabo;
    }

    public void recolherCabo(){
        System.out.println("O cabo de: "+this.tamanhoCabo+ "foi recolhido");
    }

    @Override
    public boolean verificarBateria(){
        if(super.isBateria()){
            System.out.println("Bateria carregada");
            return true;
        }else{
            System.out.println("Bateria fraca!");
            return false;
        }
    }
    
}
