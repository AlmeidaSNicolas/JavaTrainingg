package nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.desafios;

import java.io.Serializable;

public class Produto implements Serializable {
    private static final long serialVersionUID = 5L;
    private String nome;
    private int preco;

    public Produto(int preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
