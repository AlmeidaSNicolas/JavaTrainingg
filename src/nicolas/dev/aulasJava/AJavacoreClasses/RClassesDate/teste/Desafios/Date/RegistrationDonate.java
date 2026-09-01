package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste.Desafios.Date;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class RegistrationDonate {
    public static void main(String[] args) {

        LocalDate dataCadastro = LocalDate.of(2026, 1 , 15);
        LocalDate dataDeHoje = LocalDate.now();

        System.out.println("Dias cadastrados do usuario : " + ChronoUnit.DAYS.between(dataCadastro, dataDeHoje));
        System.out.println("Total de semanas de cadastro : " + ChronoUnit.WEEKS.between(dataCadastro, dataDeHoje));
        System.out.println("Total de meses de fidelidade : " + ChronoUnit.MONTHS.between(dataCadastro, dataDeHoje));

        LocalDateTime horaDaConsulta = LocalDateTime.now();
        LocalDateTime horaTruncada = LocalDateTime.now().truncatedTo(ChronoUnit.HOURS);

        System.out.println("Hora da consulta no sistema : " + horaDaConsulta);
        System.out.println("Formato truncado em horas : " + horaTruncada);
    }
}
