package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Computador;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Produto;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Telefone;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio.Tomate;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.servico.CalcularImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Tomate t1 = new Tomate("Tomace cereja", 20);
        t1.setDataValidade("14/07/2028");

        CalcularImposto.calcularImposto(t1);

    }
}
