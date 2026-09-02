package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.time.LocalDate;


public class TemporalAdjustersTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        now = now.withMonth(11); //muda somente o mes do now
        now = now.withYear(2005); //muda somente o ano do now
        now = now.withDayOfMonth(10); //muda somente o dia do mes
        now = now.withDayOfYear(120); //dia 120 do mes
        System.out.println(now);



    }
}
