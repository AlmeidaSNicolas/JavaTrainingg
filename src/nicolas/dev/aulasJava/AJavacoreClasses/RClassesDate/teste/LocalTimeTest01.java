package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {

        LocalTime localT = LocalTime.now();
        LocalTime localTof = LocalTime.of(22, 10, 59);

        System.out.println("Exemplo data digitada a dedo : " + localTof);

        System.out.println("Exemplo data de agora : " + localT);


    }
}
