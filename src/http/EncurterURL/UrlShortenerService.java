package http.EncurterURL;

import com.sun.net.httpserver.HttpServer;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UrlShortenerService {

    private static final Path diretorio = Paths.get("app", "storage");
    private static final Path arquivo = diretorio.resolve("urls.txt");
    private static final Map<String, String> urlMap = new ConcurrentHashMap<>();

    public static void main(String[] args) throws IOException {

        inicializarSistema();

        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
        httpServer.createContext("/encurtar", new UrlHandlerSalvar());
        httpServer.createContext("/r/", new RedirecionarHandler());
        httpServer.setExecutor(null);
        System.out.println("Servidor HTTP rodando na porta 8080...");
        httpServer.start();

    }

    private static void inicializarSistema() {
        try {
            if (Files.exists(diretorio)) {
                System.out.println("Arquivo Existe");
            } else if (Files.notExists(diretorio)) {
                Files.createDirectories(diretorio);
                System.out.println("Diretorio Criado");
            }

            if (Files.exists(arquivo)) {
                System.out.println("Arquivo txt existe");
            } else if (Files.notExists(arquivo)) {
                Files.createFile(arquivo);
                System.out.println("Arquivo txt criado");
            }

            List<String> linhas = Files.readAllLines(arquivo);
            for (String linha : linhas) {
                String[] partes = linha.split(";");

                if (partes.length == 2) {
                    urlMap.put(partes[0], partes[1]);
                }

            }

        } catch (IOException e) {
            System.out.println(e);

        }
    }

    public static void salvarUrl(String codigo, String urlOriginal) {
        urlMap.put(codigo, urlOriginal);

        String linha = codigo + ";" + urlOriginal + System.lineSeparator();

        try(BufferedWriter bw = Files.newBufferedWriter(arquivo, StandardOpenOption.APPEND)){
            bw.write(linha);
        }catch (IOException e){
            System.out.println("ERROR " + e);
        }

    }

    public static String buscarUrlOriginal(String codigo){
        return urlMap.get(codigo);
    }

    }

