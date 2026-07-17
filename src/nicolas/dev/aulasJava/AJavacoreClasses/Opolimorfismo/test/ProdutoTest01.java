package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.dominio.Computador;
import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.dominio.Produto;
import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.dominio.Telefone;
import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Produto produto1 = new Computador("AirM5pro", 16000);
        Produto produto2 = new Telefone("Iphone 19", 22000);

        CalcularImposto.calcularImposto(produto1);
        System.out.println();
        CalcularImposto.calcularImposto(produto2);

    }
}
