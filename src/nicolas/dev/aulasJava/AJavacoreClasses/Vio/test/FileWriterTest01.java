package nicolas.dev.aulasJava.AJavacoreClasses.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//classes file
// File ->
//FileWriter -> leitura
//FileReader
//BufferedWriter
//BuferredReader -> leitura
public class FileWriterTest01 {
    public static void main(String[] args) {

        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)){
           fw.write("A aula hoje ta rendendo deve ser pelo forró " );
           fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
