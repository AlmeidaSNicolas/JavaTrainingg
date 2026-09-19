package nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios.filepulse.model;

import nicolas.dev.aulasJava.AJavacoreClasses.Wnio.desafios.filepulse.service.StoreManagerService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePulseAplicattion {
    public static void main(String[] args) throws IOException {

        StoreManagerService storeManagerService = new StoreManagerService();

        Path diretorioRaiz = Paths.get("storage_pulse");

        storeManagerService.inicializarEstrutura(diretorioRaiz);
        storeManagerService.registrarLogEvent(diretorioRaiz, "teste.txt", "refatorando e lendo arquivo de log");
        storeManagerService.gerarRelatorioAuditoria(diretorioRaiz, "teste.txt");

    }
}
