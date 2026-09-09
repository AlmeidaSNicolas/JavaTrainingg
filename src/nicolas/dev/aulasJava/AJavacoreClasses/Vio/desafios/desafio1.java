package nicolas.dev.aulasJava.AJavacoreClasses.Vio.desafios;

import java.io.File;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class desafio1 {
    public static void main(String[] args) {

        File file = new File("RelatorioVendas.txt");

        try{
            boolean criadoAgora = file.createNewFile();
            if (criadoAgora){
                System.out.println("Arquivo ja criado!");
            }else{
                System.out.println("Arquivo ja existe no disco");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        LocalDateTime localNow = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Europe/Madrid");
        ZoneId zoneSp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zonedDateTime = localNow.atZone(zoneId);
        ZonedDateTime zoneDateSp = zonedDateTime.withZoneSameInstant(zoneSp);

        System.out.println("== Dados do arquivo ==");
        System.out.println("Nome : " + file.getPath());
        System.out.println("Caminho absoluto : " + file.getAbsolutePath());
        System.out.println("Arquivo existe ? " + file.exists());

        System.out.println("== Datas ==");
        System.out.println("Data no fuso europa " + zonedDateTime.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy 'as' HH:mm")) );
        System.out.println("Data no fuso de Sp " + zoneDateSp.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy 'as' HH:mm")) );

    }
}
