package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStorageService {
    public static void main(String[] args) {

        Path diretorioRaiz = Paths.get("app_storage", ".", "temp", "..", "upload");
        Path caminhoNormalizado = diretorioRaiz.normalize();

       try{
           if (Files.notExists(diretorioRaiz)){
               Files.createDirectories(diretorioRaiz);
               System.out.println("Todos diretorios criados com sucesso na : " + caminhoNormalizado);
           }
       }catch (IOException e){
           System.out.println(e);
       }



    }
}
