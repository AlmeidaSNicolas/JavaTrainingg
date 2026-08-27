package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

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


    }
}
