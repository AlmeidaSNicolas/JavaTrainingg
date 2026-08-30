package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantTest01 {
    public static void main(String[] args) {

        Instant t1 = Instant.now(); //instant inicial capturado


        Instant variavelFinal;

        try{

            Thread.sleep(3000);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        variavelFinal = Instant.now();

        System.out.println("=== lOG de auditoria === ");
        System.out.println("Inicio em UTC : " + t1);
        System.out.println("Fim em UTC : " + variavelFinal);

        System.out.println("Detalhes tecnicos do inicio : ");
        System.out.println(t1.toEpochMilli()); //capturando em milisegundo
        System.out.println(t1.getEpochSecond()); //capturando apenas Segundos
        System.out.println(t1.getNano()); //capturando nano

        System.out.println(Instant.now().get(ChronoField.YEAR));

    }
}
