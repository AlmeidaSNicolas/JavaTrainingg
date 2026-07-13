package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.servico;

import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Produto;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Tomate;

public class CalcularImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio... ");
        double imposto = produto.CacularTaxa();
        System.out.println("Nome do produto : " + produto.getNome());
        System.out.println("Valor : " + produto.getValor());
        System.out.println("Imposto em cima do produto : " + imposto);
        if(produto instanceof  Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.printf("Data de validade: %n" + tomate.getDataValidade());
        }

    }
}
