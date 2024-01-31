package pessoa;

import java.util.Date;

public abstract class Pessoa {

    private String nome;
    private String apelido;
    private Date criacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }
    
    public abstract void imprimirDados();
}
