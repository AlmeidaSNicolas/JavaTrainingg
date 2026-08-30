package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.EXfinal.Local;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {

        LocalDate lcd1 = LocalDate.of(2005, Month.NOVEMBER, 10);
        LocalDate lcd2 = LocalDate.now();

        LocalDate l4 = LocalDate.of(2026, 2 ,21);
        System.out.println(l4);

        LocalDate l6 = LocalDate.of(2026,8, 30);
        l6.plusDays(10);
        System.out.println(l6);

        System.out.println(lcd1.getYear());
        System.out.println(lcd1.getMonth());
        System.out.println(lcd1.getMonthValue());
        System.out.println(lcd1.getDayOfWeek());
        System.out.println(lcd1.getDayOfYear());

        System.out.println(lcd1.isLeapYear());
        System.out.println(lcd2  );

    }
}
