package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PipelineLogsNio {
    public static void main(String[] args) throws IIOException {

        Path pathArquivo = Paths.get("app", "output", "logs");
        File file = pathArquivo.toFile();

        File rotina = new File(file, "rotina_execução.txt");

        try{
            boolean isCreated = rotina.createNewFile();
            if (isCreated){
                System.out.println("Arquivo Criado!");
            }else{
                System.out.println("Arquivo ja existe no disco");
            }

            System.out.println(rotina.getAbsoluteFile().getPath());

            try(FileWriter fw = new FileWriter(rotina, true);
                BufferedWriter bw = new BufferedWriter(fw);){

                LocalDateTime linha1Padronizada = LocalDateTime.now();
                LocalDateTime linha2Padronizada = LocalDateTime.now();

                bw.write("[INFO] : Processo de Sincronização executado " + linha1Padronizada.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy 'as' HH:mm:ss" )));
                bw.newLine();
                bw.flush();
                bw.write("[INFO] : Processo de Sincronização executado " + linha2Padronizada.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy 'as' HH:mm:ss")) );
                bw.newLine();
                bw.flush();

            }catch (IOException e){
                System.out.println(e);
            }

            try(FileReader fileReader = new FileReader(rotina);
                BufferedReader bw = new BufferedReader(fileReader);){

                String linha;
                int contaLinha = 0;
                while((linha = bw.readLine()) != null){
                    contaLinha++;
                    System.out.println(contaLinha + " : " + linha); //mesma dinamica do int i !=
                }

            }catch (IOException e){
                System.out.println(e);
            }


        }catch (IOException e){
            System.out.println(e);
        }

    }
}
