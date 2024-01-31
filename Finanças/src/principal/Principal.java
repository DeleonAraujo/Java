package principal;

import pessoa.PessoaJuridica;

public class Principal {
    
    public static void main(String[] args) {
        
        PessoaJuridica pj = new PessoaJuridica();
        
        pj.setApelido("Empresa Teste");
        pj.setNome("Expresso do Amanhã");
        
        System.out.println(pj.getNome());
        pj.imprimirDados();
    }
    
}
