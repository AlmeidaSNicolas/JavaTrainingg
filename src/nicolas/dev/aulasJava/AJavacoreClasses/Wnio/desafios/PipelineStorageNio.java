package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PipelineStorageNio {
    public static void main(String[] args) throws IOException{

        Path caminhoBruto = Paths.get("sistema", ".", "temp", "..", "storage", "bruto");
        Files.createDirectories(caminhoBruto);
        Path caminhoBrutoNormalizado = caminhoBruto.normalize();

        Path arquivoSubpasta = caminhoBrutoNormalizado.resolve("2026");
        Files.createDirectories(arquivoSubpasta);

        Path aquivoDeTexto = arquivoSubpasta.resolve("transacoes_dump.log");
        Files.createFile(aquivoDeTexto);


        Path resolve = caminhoBrutoNormalizado.resolve(arquivoSubpasta);
        System.out.println("Caminho bruto resolvido : " + resolve);

        //
        try(
            BufferedWriter bw = Files.newBufferedWriter(aquivoDeTexto);
        ){
            bw.write("LOG-1: OK");
            bw.newLine();
            bw.write("LOG-2: OK");
            bw.newLine();
            bw.write("LOG-3: OK");
            bw.newLine();
        }catch (IOException e){
            System.out.println(e);
        }

        Path segundoCaminho = Paths.get("sistema", "painel", "dashboard");
        Path relativizeSegundoCaminhjo = caminhoBrutoNormalizado.relativize(segundoCaminho);
        System.out.println("Como chegar no segundo caminho :" + relativizeSegundoCaminhjo.normalize());

        BasicFileAttributes basicFileAttributes = Files.readAttributes(arquivoSubpasta, BasicFileAttributes.class);
        System.out.println(basicFileAttributes.creationTime());

    }
}
