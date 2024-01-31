package animais;

public class Cachorro extends Animal{
    
    private String porte;

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
       
    public void latir(){
        System.out.println("Au, au!");
    }

    @Override
    public void andar() {
        System.out.println("Cachorro andando!");
    }

    @Override
    public void brincar() {
        System.out.println("Cachorro brincando!");
    }
    
}
