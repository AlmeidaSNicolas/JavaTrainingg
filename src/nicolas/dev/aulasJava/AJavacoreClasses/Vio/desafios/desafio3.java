package nicolas.dev.aulasJava.AJavacoreClasses.Vio.desafios;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class desafio3 {
    public static void main(String[] args) {

        File file = new File("Log_Sistema.txt");

        try(FileReader fr = new FileReader(file)){
            int i;
            int totalDeCaracteres = 0;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
                totalDeCaracteres ++;
            }
            System.out.println();
            System.out.println("Total de caracteres lidos : " + totalDeCaracteres);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
