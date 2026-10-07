package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;


class listarTudo extends SimpleFileVisitor<Path>{

    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{Test*}.{java,class}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs){
        if (matcher.matches(file)) {
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
};


public class SimpleFilePathDesafio {
    public static void main(String[] args) throws IOException{

        Path testeJava = Paths.get(".");
        Files.walkFileTree(testeJava, new listarTudo());

    }

}
