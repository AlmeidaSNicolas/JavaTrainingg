package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class FileStorageService {
    public static void main(String[] args) throws IOException {

        Path diretorioRaiz = Paths.get("app_storage", ".", "temp", "..", "upload");
        Path caminhoNormalizado = diretorioRaiz.normalize();

       try{
           if (Files.notExists(diretorioRaiz)){
               Files.createDirectories(diretorioRaiz);
               System.out.println("Todos diretorios criados com sucesso na : " + caminhoNormalizado);
           }
       }catch (IOException e){
           System.out.println(e);
       }

       Path rotaDinamica = diretorioRaiz.resolve("2026/09");
       Path caminhoNormalizado2 = rotaDinamica.normalize();

       Path arquivoTxt = caminhoNormalizado2.resolve("relatorio_vendas.txt");


        try {
           if (Files.notExists(rotaDinamica)){
               Files.createDirectories(rotaDinamica);
               System.out.println("Todos diretorios criados com sucesso na : " + caminhoNormalizado2);
           }
        }catch (IOException e){
           System.out.println(e);
       }

        try {
            if (Files.notExists(arquivoTxt)){
                Files.createFile(arquivoTxt);
                System.out.println("Criado");
            }
        }catch (IOException e){
            System.out.println(e);
        }

        try (BufferedWriter bw = Files.newBufferedWriter(arquivoTxt)){

            bw.write("ID_CLIENTE;VALOR;STATUS");
            bw.write("101;1500.00;APROVADO");
            bw.newLine();
            bw.write("ID_CLIENTE;VALOR;STATUS");
            bw.write("102;1600.00;APROVADO");
            bw.newLine();
            bw.write("ID_CLIENTE;VALOR;STATUS");
            bw.write("103;1700.00;APROVADO");

        }catch (IOException e){
            System.out.println(e);
        }

        BasicFileAttributes bsfattr = Files.readAttributes(arquivoTxt, BasicFileAttributes.class);
        System.out.println("Tempo de criação : " + bsfattr.creationTime());
        System.out.println("Arquivo é regular ? : " + bsfattr.isRegularFile());
        System.out.println("Tamanho em Bytes ? : " + bsfattr.size());

        Path pastaBackup = Paths.get("app_storage", "backups");
        System.out.println(pastaBackup.relativize(arquivoTxt));

    }
}
