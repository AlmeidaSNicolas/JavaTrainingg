package nicolas.dev.aulasJava.AJavacoreClasses.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {

        File diretorio = new File("pasta");
        boolean isCreated = diretorio.mkdir();
        System.out.println(isCreated);
        File arquivo = new File(diretorio, "live.txt");
        boolean isCriadoArquivo = arquivo.createNewFile();
        System.out.println(isCriadoArquivo);

        File arquivo2 = new File(diretorio, "live2.txt"); //tambem tenho que passar o file respectivo da minha pasta(no caso da aula)
        boolean isRenamed = arquivo.renameTo(arquivo2);
        System.out.println(isRenamed);


    }
}
