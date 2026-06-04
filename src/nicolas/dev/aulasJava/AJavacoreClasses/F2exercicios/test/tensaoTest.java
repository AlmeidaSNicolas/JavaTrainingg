package nicolas.dev.aulasJava.AJavacoreClasses.Fexercicios.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Fexercicios.dominio.tensao;

public class tensaoTest {
    public static void main(String[] args) {

        tensao t1 = new tensao("Artico", "Eua | Irã");

        tensao t2 = new tensao("Nova guiné","Brasil | Ira", "Guerra terrestre", true);

        t1.ImprimirStatus();
        System.out.println("Dados 2 abaixo");
        t2.ImprimirStatus();
    }
}
