package nicolas.dev.aulasJava.AJavacoreClasses.Vio.desafios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class desafio2 {
    public static void main(String[] args) {

        File file = new File("Log_Sistema.txt");

        LocalDateTime localNow = LocalDateTime.now();

        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Logs do sistema : " + localNow.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy HH:ss")) );

            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
