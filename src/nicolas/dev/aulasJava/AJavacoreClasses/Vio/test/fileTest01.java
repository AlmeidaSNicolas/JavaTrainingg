package nicolas.dev.aulasJava.AJavacoreClasses.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class fileTest01 {
    public static void main(String[] args) {
        // File fileLocalEspecifico = new File("/Users/nicolas/IdeaProjects/JavaTrainingg/src/Exercicios"); //Cria em uma pasta especifica


        File file = new File("aula.txt"); //cria na nossa pasta atual

        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            boolean existe = file.exists();
            System.out.println("Nome do arquivo : " + file.getPath());
            System.out.println("Caminho absoluto : " + file.getAbsolutePath());
            System.out.printf("É um diretorio ? " + file.isDirectory());
            System.out.println();
            System.out.println("É um arquivo ? " + file.isFile());
            System.out.println("É um arquivo oculto ? " + file.isHidden());
            System.out.println("Quando foi modificado  ? " + new Date(file.lastModified()));



            if(existe){
                boolean deleted = file.delete();
                System.out.println("Arquivo deletado ?");
                System.out.println(deleted);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
