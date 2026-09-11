package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class pathTest01 {
    public static void main(String[] args) {

        Path path = Paths.get("/Users/nicolas/IdeaProjects/JavaTrainingg/relatorio_usuarios.txt");
        System.out.println(path);
        Path path1 = path.getParent();
        System.out.println(path1);


    }
}
