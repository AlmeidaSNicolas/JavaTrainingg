package nicolas.dev.aulasJava.AJavacoreClasses.Vio.desafios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class desafioMkdirs {
    public static void main(String[] args) throws IOException {

        File diretorioPrincipal = new File("ex/sistema/logs/backup");
        boolean isDiretoryCreated = diretorioPrincipal.mkdirs();
        System.out.println(isDiretoryCreated);

        File fileLog = new File("temp_log_txt");
        boolean isCreated = fileLog.createNewFile();
        System.out.println(isCreated);

        try(FileWriter fr = new FileWriter(fileLog);
            BufferedWriter bw = new BufferedWriter(fr)
        ){
            LocalDateTime localDateTime = LocalDateTime.now();
            bw.write("LOG ALTERAÇÃO NO MOMENTO : " + localDateTime.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy")) );
            bw.newLine();
            bw.flush();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }

        File fileDestino = new File(diretorioPrincipal, "LOG_CONSOLIDADO_TXT");
        boolean foiFeito = fileLog.renameTo(fileDestino);
        System.out.println(foiFeito);

    }
}
