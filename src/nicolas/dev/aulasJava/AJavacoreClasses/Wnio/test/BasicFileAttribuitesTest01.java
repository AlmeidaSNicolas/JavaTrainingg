package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.test;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttribuitesTest01 {
    public static void main(String[] args) throws IOException {

        //BasicFileAttributes
        //DosFileAttributes
        //PosixFileAttributes

        File fileLog = new File("logs", "auditoria_sistema.log");
        boolean isCreated = fileLog.createNewFile();
        System.out.println(isCreated);

        Path path = Paths.get("logs", "auditoria_sistema.log");

        BasicFileAttributes bsfattr = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println("é valido ? " + bsfattr.isRegularFile());
        System.out.println("tamanho ? " + bsfattr.size());
        System.out.println("creation time ? " + bsfattr.creationTime());




    }
}
