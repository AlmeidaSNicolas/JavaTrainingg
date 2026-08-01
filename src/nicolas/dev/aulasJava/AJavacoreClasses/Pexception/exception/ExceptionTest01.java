package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.exception;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo Criado com sucesso" + isCreate);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
