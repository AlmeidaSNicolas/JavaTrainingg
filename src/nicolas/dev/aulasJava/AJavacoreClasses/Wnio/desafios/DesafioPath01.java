package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DesafioPath01 {
    public static void main(String[] args) {

        Path path = Paths.get("ex", "sistema", "logs", "backup", "LOG_CONSOLIDADO_TXT");

        System.out.println(path);
        System.out.println("Absolute path : " + path.toAbsolutePath());
        System.out.println("File name : " + path.getFileName());
        System.out.println("Parent : " + path.getParent());
        System.out.println("Root : " + path.getRoot());

        System.out.println(path.toFile().exists());


    }
}
