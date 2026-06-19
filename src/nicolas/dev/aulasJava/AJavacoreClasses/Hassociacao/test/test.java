package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio.Catalago;
import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio.Produto;

public class test {
    public static void main(String[] args) {

        Catalago c1 = new Catalago();
        Produto p1 = new Produto("televisao", 210);
        Produto p2 = new Produto("papel", 120);
        Produto p3 = new Produto("Ps5", 500);


        c1.adicionarProduto(p1);
        c1.adicionarProduto(p2);
        c1.adicionarProduto(p3);

        c1.listarProdutos();


    }
}
