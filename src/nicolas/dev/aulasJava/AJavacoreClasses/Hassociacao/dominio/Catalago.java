package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio;

import java.util.ArrayList;
import java.util.Arrays;

public class Catalago {

    {
        System.out.println("Carregando catalogo....");
    }


    static ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto p){
        produtos.add(p);
        System.out.println("Produto adicionado ");
    }

    public void listarProdutos(){
        if (produtos.isEmpty()) {
            System.out.println("Lista de produtos vazia, por favor adicionar para consultar");
        }else{
            System.out.println("Listando Produtos");
            System.out.println();
            for (Produto produto : produtos) {
                System.out.println("Nome : " +  produto.getNome());
                System.out.println("Preco : " +  produto.getPreco());
                System.out.println();
            }
        }

    }
}
