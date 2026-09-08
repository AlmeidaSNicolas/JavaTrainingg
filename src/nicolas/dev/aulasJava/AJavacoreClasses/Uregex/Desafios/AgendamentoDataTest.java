package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.Desafios;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class AgendamentoDataTest {
    public static void main(String[] args) {

        LocalDate reuniao = LocalDate.of(2025, Month.OCTOBER, 15);
        LocalTime horaReuniao = LocalTime.of(14, 30);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy HH:mm");
        LocalDateTime localEHorario = reuniao.atTime(horaReuniao);

        ZoneId zoneId = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonedDateTime = localEHorario.atZone(zoneId);
        ZonedDateTime zonedDateTimeBrasil = zonedDateTime.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        System.out.println("Agendamento fuso espanha : " + zonedDateTime.format(dateTimeFormatter));
        System.out.println("Agendamento fuso brasil : " + zonedDateTimeBrasil.format(dateTimeFormatter));

    }
}
