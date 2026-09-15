package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {

        Path dir = Paths.get("/home/nicolas");
        Path clazs = Paths.get("/home/nicolas/pastaTeste/OlaWorld.java");

        Path pathtOcLAZZ = dir.relativize(clazs);
        System.out.println(pathtOcLAZZ);

        Path p1 = Paths.get("app/logs");
        Path p2 = Paths.get("app/config");

        Path pathToClass = p1.relativize(p2);
        System.out.println(pathToClass);

    }
}
