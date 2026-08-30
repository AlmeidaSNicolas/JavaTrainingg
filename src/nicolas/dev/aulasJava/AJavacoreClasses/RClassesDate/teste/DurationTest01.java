package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DurationTest01 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime after2years = LocalDateTime.now().plusYears(2);
        Duration depoisDoisAnos = Duration.between(now, after2years);
        System.out.println(" o tempo que passou foi esse : " + depoisDoisAnos);

        System.out.println(Duration.ofHours(5));

        System.out.println(Duration.between(LocalDate.now(), LocalDate.now().plusDays(2)));
    }
}
