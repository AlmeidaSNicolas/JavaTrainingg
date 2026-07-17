package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.dominio.Tomate;
import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.servico.CalcularImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {

        Tomate t1 = new Tomate("Tomace cereja", 20);
        t1.setDataValidade("14/07/2028");

        CalcularImposto.calcularImposto(t1);

    }
}
