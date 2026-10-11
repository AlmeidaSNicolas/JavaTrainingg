package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Carro;
import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {

        smartphone s1 = new smartphone("A134B", "SAN");
        smartphone s2 = new smartphone("A134B", "xa");

        System.out.println(s1.equals(s2));

        Carro c1 = new Carro("hyundai","ford");
        Carro c2 = new Carro("hyundai","ford");
        //aqui vai dar false por conta da comparação em endereço de memoria.


        String nul = "com dados";
        String d2 = "soso";

        System.out.println(nul.equals(null));


        System.out.println(c1.equals(c2));

    }
}
