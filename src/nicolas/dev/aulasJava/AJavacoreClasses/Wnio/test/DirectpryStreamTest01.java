package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectpryStreamTest01 {
    public static void main(String[] args) {

        Path dir = Paths.get(".");

        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir, "*log")){
            for (Path path : stream){
                System.out.println(path.getFileName().getParent());
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
