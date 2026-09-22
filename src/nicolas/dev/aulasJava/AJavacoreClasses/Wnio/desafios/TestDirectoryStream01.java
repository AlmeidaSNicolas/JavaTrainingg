package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class TestDirectoryStream01 {
    public static void main(String[] args) {

        Path dir = Paths.get("logs");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*.log")
        ){
            for (Path path: stream){
                System.out.println(path.getFileName());
                System.out.println(Files.size(path));
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
