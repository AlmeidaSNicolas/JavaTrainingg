package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Carro;
import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.celular;

public class EqualsTest01 {
    public static void main(String[] args) {

        celular s1 = new celular("A134B", "SAN");
        celular s2 = new celular("A134B", "xa");

        System.out.println(s1.equals(s2));

        Carro c1 = new Carro("hyundai","ford");
        Carro c2 = new Carro("hyundai","ford");
        //aqui vai dar false p or conta da comparação em endereço de memoria.


        String nul = "com dados";
        String d2 = "soso";

        System.out.println(nul.equals(null));


        System.out.println(c1.equals(c2));

        System.out.println("Bob".hashCode());

    }
}
