package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.runtime.test;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {

    }


    public static void lerArquivo(){
        try(Reader reading = new BufferedReader(new FileReader("teste1.tsxt"))){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void lerArquivo2(){
        Reader reading = null;
        try {
            reading = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                reading.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
