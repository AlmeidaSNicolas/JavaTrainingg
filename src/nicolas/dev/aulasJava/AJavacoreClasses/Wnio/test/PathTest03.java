package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest03 {
    public static void main(String[] args) {

        Path dir = Paths.get("home/Nicolas");
        Path arquivo = Paths.get("dev/arquivo.txt");

        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path dir2 = Paths.get("ex/sistema/logs");
        Path arquivo2 = Paths.get("backup/LOG_CONSOLIDADO.TXT");

        Path resolve2 = dir2.resolve(arquivo2);
        System.out.println(resolve2);

    }
}
