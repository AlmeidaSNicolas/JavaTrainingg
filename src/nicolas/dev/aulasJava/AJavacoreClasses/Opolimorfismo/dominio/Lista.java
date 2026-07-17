package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Computador("DELL3520", 1000));
        produtos.add(new Telefone("AIPHONE56", 102300));
        Impressora i1 = new Impressora();

        Produto computador = new Computador("thinkpad x23", 20000);


        i1.Imprimir(computador);

        for(Produto produto : produtos){
            i1.Imprimir(produto);
        }
    }
}
