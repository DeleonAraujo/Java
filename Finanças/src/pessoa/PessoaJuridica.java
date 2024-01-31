package pessoa;

public class PessoaJuridica extends Pessoa{
    
    private int cnpj;
    private String[] socios;

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String[] getSocios() {
        return socios;
    }

    public void setSocios(String[] socios) {
        this.socios = socios;
    }

    @Override
    public void imprimirDados() {
        System.out.println("O nome da empresa é: "+getNome()+ " A razão social é: "+getApelido()+ 
                " A data de criação é: "+getCriacao()+ " ,o CNPJ e: "+getCnpj());
        /*for(String socio: this.socios){
            System.out.println("Socio" + socio);
        }*/
    }
}
