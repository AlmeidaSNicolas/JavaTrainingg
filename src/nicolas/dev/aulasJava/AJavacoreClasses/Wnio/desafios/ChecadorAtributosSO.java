package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class ChecadorAtributosSO {
    public static void main(String[] args) throws IOException{

        Path caminho = Paths.get("temp");
        Path arquivoTxt = caminho.resolve("plataforma_test.txt");

        try{
            Files.createDirectories(caminho);
            Files.createFile(arquivoTxt);
            System.out.println("Criado com sucesso!");
        }catch (IOException e ){
            System.out.println(e);
        }


        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(arquivoTxt, PosixFileAttributes.class);
            System.out.println(basicFileAttributes);


        }catch (IOException e ){
            System.out.println(e);
        }

        try{
            BasicFileAttributes windowsAtributes = Files.readAttributes(arquivoTxt, DosFileAttributes.class);
            System.out.println(windowsAtributes + "Visao do windows nao suportada nesse OS");
        } catch (UnsupportedOperationException e) {
            System.out.println("Visao do windows nao suportada nesse os");
        }


    }
}
