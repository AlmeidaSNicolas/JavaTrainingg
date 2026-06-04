package nicolas.dev.aulasJava.AJavacoreClasses.F2exercicios.test;

import nicolas.dev.aulasJava.AJavacoreClasses.F2exercicios.dominio.fontes;

public class fontesTest {
    public static void main(String[] args) {

        fontes f1 = new fontes("Artico entra em guerra", "www.URLFAKE.COM.BR");

        f1.imprimir();

        System.out.println("--------------------");

        fontes f2 = new fontes("EUA X IRA RECOMEÇA APOS ACORDO FALHAR", "true.com.br", "ira");

        f2.imprimir();

        System.out.println("----------------");

        fontes f3 = new fontes("Brasil entra na guerra da ucrania", "brasilverdade.com", "Brasil", 5);

        f3.imprimir();
    }
}
