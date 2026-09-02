package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class ZoneTest01 {
    public static void main(String[] args) {

        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime l1 = LocalDateTime.now();
        System.out.println(l1);

        ZonedDateTime tokyoTest = l1.atZone(tokyoZone);
        System.out.println(tokyoTest);



    }
}
