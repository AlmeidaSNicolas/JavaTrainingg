package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;


import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class listarTudo extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith("java")){
            System.out.println(file.getFileName());
            return FileVisitResult.CONTINUE;
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit " + dir.getFileName().toString());
        return FileVisitResult.CONTINUE;
    }

}

public class SimpleFileVisitorpt2 {
    public static void main(String[] args) throws IOException {

        Path dir = Paths.get("sistema");
        Files.walkFileTree(dir, new listarTudo());

    }
}
