package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.Desafios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFixaçãoEx {
    public static void main(String[] args) {

        String regexUnificada = "\\d{4}-\\d{2}-\\d{2}|\\d{2}:\\d{2}|0[xX][0-9a-fA-F]+";
        String texto = "LOG_EVENTO - Data: 2026-09-04 Hora: 18:05 ErroHex: 0xFA4";
        Pattern pattern = Pattern.compile(regexUnificada);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            String achado = matcher.group();

            if (achado.contains("-")) {
                // É a Data
                LocalDate data = LocalDate.parse(achado);
                System.out.println("Data BR: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            } else if (achado.contains(":")) {
                // É a Hora
                LocalTime hora = LocalTime.parse(achado);
                System.out.println("Hora BR: " + hora.format(DateTimeFormatter.ofPattern("HH:mm")));
            } else {
                // É o Hexadecimal
                System.out.println("Hex: " + achado);
            }
        }

    }
}
