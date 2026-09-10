package nicolas.dev.aulasJava.AJavacoreClasses.Vio.desafios;

import java.io.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GerenciadorDeLogsIntegrado {
    public static void main(String[] args) throws Exception{

        File file = new File("historico_execução.txt");

        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ){
            boolean criadoAgora = file.createNewFile();
            if (criadoAgora){
                System.out.println("Arquivo ja criado !");
            }else {
                System.out.println("Arquivo ja existe no disco");
            }

            LocalDateTime localDateTime = LocalDateTime.now();
            bufferedWriter.write("Estamos em live espero que gostem! na data de : " + localDateTime.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy 'as' HH:mm:ss")));
            bufferedWriter.newLine();
            bufferedWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fileReader = new FileReader(file)){
            int i;
            while((i = fileReader.read()) != -1){
                System.out.print((char)i);
            }
            System.out.println(fileReader.read());
        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}
