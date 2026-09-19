package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios.filepulse.service;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class StoreManagerService {

    public void inicializarEstrutura(Path diretorioRais) {

        Path subpasta1 = diretorioRais.resolve("suportados/logs");
        Path subpasta2 = diretorioRais.resolve("suportados/processados");


        try {
            if (Files.notExists(diretorioRais)) {
                Files.createDirectories(diretorioRais);
                Files.createDirectories(subpasta1);
                Files.createDirectories(subpasta2);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Path absoluto = diretorioRais.toAbsolutePath().normalize();
        System.out.println("caminho absoluto : " + absoluto);
    }

    public void registrarLogEvent(Path diretorioRais, String nomeArquivo, String conteudo) {

        Path caminhoArquivoLog = diretorioRais.resolve("suportados/logs").resolve(nomeArquivo).normalize();

        try {
            if (Files.notExists(caminhoArquivoLog)) {
                Files.createFile(caminhoArquivoLog);
            } else {
                System.out.println("Arquivo ja existe");
            }

            try (BufferedWriter bw = Files.newBufferedWriter(caminhoArquivoLog)) {
                bw.write(conteudo);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e);
        }


    }

    ;

    public void gerarRelatorioAuditoria(Path diretorioRais, String nomeArquivoLog) throws IOException {
        Path arquivoDeLog = diretorioRais.resolve("suportados/logs").resolve(nomeArquivoLog).normalize();

        if (Files.notExists(arquivoDeLog)) {
            System.out.println("Arquivo de log para auditoria nao encontrado");
            throw new IllegalArgumentException("Arquivo inexistente: " + arquivoDeLog);
        }

        BasicFileAttributes basicFileAttributes = Files.readAttributes(arquivoDeLog, BasicFileAttributes.class);

        System.out.println("Dados do arquivo : ");
        System.out.println("Tamanho : " + basicFileAttributes.size());
        System.out.println("Data de criação : " + basicFileAttributes.creationTime());
        System.out.println("Data de ultima modificação : " + basicFileAttributes.lastModifiedTime());
        System.out.println("Caminho relativo: " + diretorioRais.relativize(arquivoDeLog));
    }
}
