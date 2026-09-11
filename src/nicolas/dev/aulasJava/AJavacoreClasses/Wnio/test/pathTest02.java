package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pathTest02 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pastaPathTeste");
        Path pathDirectory = Files.createDirectory(path);

        System.out.println(pathDirectory);

    }
}
