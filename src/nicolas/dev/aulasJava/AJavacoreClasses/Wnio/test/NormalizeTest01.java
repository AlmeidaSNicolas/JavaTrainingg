package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {

        String diretorioDoProjeto = "home/Nicolas/dev";
        String arquivotXT = "../../arquivo.txt";

        Path path1 = Paths.get(diretorioDoProjeto, arquivotXT);
        Path path2 = Paths.get("/home/./Nicolas/./dev");
        System.out.println(path1);
        System.out.println(path1.normalize());

        System.out.println(path2);
        System.out.println(path2.normalize());

        System.out.println(path1.toAbsolutePath());
        System.out.println(path1.normalize());


    }
}
