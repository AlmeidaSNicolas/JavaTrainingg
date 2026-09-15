package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.nio.file.Path;
import java.nio.file.Paths;

public class DesafioRelative01 {
    public static void main(String[] args) {

        Path origem = Paths.get("home", "nicolas", "projetos", "backend");
        Path destino = Paths.get("home", "nicolas", "estudos", "java");

        Path relativize = origem.relativize(destino);
        System.out.println(relativize);

        Path testeExtra = origem.resolve(relativize);
        System.out.println(testeExtra.normalize());
    }
}
