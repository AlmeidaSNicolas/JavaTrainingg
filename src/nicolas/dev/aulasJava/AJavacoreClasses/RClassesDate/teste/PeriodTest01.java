package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate afterTwoYears = LocalDate.now().plusYears(2).plusDays(10);
        Period periodo = Period.between(now, afterTwoYears);
        System.out.println(periodo + " Periodo passado");

        Period p = Period.ofDays(60);
        System.out.println(p);

        Period s = Period.of(2, 5, 10);
        System.out.println(s.toString());

        Period sp = Period.ofYears(2).ofMonths(3).ofDays(10);
        System.out.println(sp);




    }
}
