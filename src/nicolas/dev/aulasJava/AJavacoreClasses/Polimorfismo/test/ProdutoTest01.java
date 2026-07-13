package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Computador;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Produto;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Telefone;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.servico.CalcularImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {

        Produto produto1 = new Computador("AirM5pro", 16000);
        Produto produto2 = new Telefone("Iphone 19", 22000);

        CalcularImposto.calcularImposto(produto1);
        System.out.println();
        CalcularImposto.calcularImposto(produto2);

    }
}
