package nicolas.dev.aulasJava.AJavacoreClasses.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuferedWriterTest01 {
    public static void main(String[] args) {

                File file = new File("file.txt");
                try (FileWriter fw = new FileWriter(file, true);
                     BufferedWriter bufferedWriter = new BufferedWriter(fw);
                ){
                    bufferedWriter.write("A aula hoje ta rendendo deve ser pelo forró " );
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

}