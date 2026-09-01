package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CrhonoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2005, Month.NOVEMBER, 10, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println(ChronoUnit.YEARS.between(aniversario, now));


        System.out.println(ChronoUnit.WEEKS.between(LocalDate.of(2026, 9, 1), LocalDate.of(2026, 9, 10)));

    }
}
