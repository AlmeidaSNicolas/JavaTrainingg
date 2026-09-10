package nicolas.dev.aulasJava.AJavacoreClasses.Vio.desafios;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SistemaAuditoriaCompleto {
    public static void main(String[] args) throws IOException{

        File file = new File("sistema_auditoria.txt");

        try(FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
        ){
            boolean jaCriado = file.createNewFile();
            if(jaCriado){
                System.out.println("Arquivo criado!");
            }else{
                System.out.println("Arquivo ja existe no disco.");
            }

            LocalDateTime localDateTime = LocalDateTime.now();
            bw.write("LOG de Alteração : " + localDateTime.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy 'as' HH:mm:ss")));
            bw.newLine();
            bw.write("LOG de Alteração numero 2 : " + localDateTime.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy 'as' HH:mm:ss")));
            bw.newLine();
            bw.write("Log de Alteração numero 3 : " + localDateTime.format(DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy 'as' HH:mm:ss")));
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new IOException(e);
        }

        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String linha;
            int numeroDaLinha = 0 ;
            while((linha = bufferedReader.readLine()) != null){
                numeroDaLinha++;
                System.out.println(numeroDaLinha + " [LOG] : "  + linha);
            }
        } catch (IOException e) {
            throw new IOException(e);
        }


    }
}
