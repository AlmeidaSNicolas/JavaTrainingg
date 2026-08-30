package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.EXfinal.Local;

import java.sql.SQLOutput;
import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime localT = LocalTime.now();
        LocalTime localTof = LocalTime.of(22, 10, 59);

        System.out.println(localT.getHour());
        System.out.println(localT.getMinute());
        System.out.println(localT.getSecond());

        System.out.println("Exemplo data digitada a dedo : " + localTof);

        System.out.println("Exemplo data de agora : " + localT);

        LocalTime teste1 = LocalTime.of(14, 30);
        LocalTime teste2 = LocalTime.of(14,30,15,500);

        LocalTime teste3 = LocalTime.parse("23:59:00");
        System.out.println(teste3);


    }
}
