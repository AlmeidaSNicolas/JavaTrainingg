package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.EXfinal.Local;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {

        LocalDateTime ldtm = LocalDateTime.now();
        LocalDate localDate = LocalDate.of(2022, Month.AUGUST, 5);
        LocalDate parseTest = LocalDate.parse("2005-10-11");
        LocalTime localTime = LocalTime.of(10, 30);
        LocalDate lnow = LocalDate.now();
        System.out.println(ldtm);
        System.out.println(parseTest);

        try{
            LocalTime parseLt = LocalTime.parse("14:30");
            System.out.println("parse de localTime");
            System.out.println(parseLt);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try{
            LocalDate parseDate = LocalDate.parse("2005-11-10");
            System.out.println("parse de date abaixo");
            System.out.println(parseDate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        System.out.println("extraido abaixo");
        System.out.println(ldtm.toLocalTime()); //Exclusivo da classe LocalDateTime
        System.out.println("date abaixo");
        System.out.println(ldtm.toLocalDate());

        LocalTime timetest = LocalTime.now();
        System.out.println(timetest);

        LocalDateTime lcdt2 = lnow.atTime(localTime);
        System.out.println(lcdt2);


        System.out.println("Exemplo de imutabilidade da classe");
        LocalDateTime localVideo1 = LocalDateTime.now();
        localVideo1.plusDays(12);
        System.out.println(localVideo1);

        LocalDateTime l12 = LocalDateTime.now();

        l12.toLocalDate();
        l12.toLocalTime();

        LocalDateTime localMudado = l12.plusDays(12);
        System.out.println(localMudado);


    }
}
