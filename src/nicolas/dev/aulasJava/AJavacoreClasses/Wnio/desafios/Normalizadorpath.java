package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalizadorpath {
    public static void main(String[] args) {

        Path path = Paths.get("desenvolvimento", "java", ".", "projetos", "..", "estudos", "LOG.txt");

        Path pathNormalizado = path.normalize();
        System.out.println("Caminho bruto : " + path.toAbsolutePath());
        System.out.println("Caminho normalizado : " + pathNormalizado);
    }
}
