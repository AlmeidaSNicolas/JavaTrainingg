package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DesafioResolve01 {
    public static void main(String[] args) throws IOException {

        Path arquivoDir = Paths.get("var", "www", "uploads");
        Path arquivoResolve = Paths.get("usuarios", "avatar.png");

        Path resolve = arquivoDir.resolve(arquivoResolve);

        Files.createDirectories(resolve.getParent());
        System.out.println("Caminho resolvido : " + resolve);

    }
}
