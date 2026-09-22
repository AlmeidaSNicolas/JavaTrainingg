package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("pasta/teste.txt");
        if (Files.notExists(path)) Files.createFile(path);

        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
    }

}
