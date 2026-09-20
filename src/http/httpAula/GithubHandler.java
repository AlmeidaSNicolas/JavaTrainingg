package http.httpAula;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GithubHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

        Path arquivoJson = Paths.get("/Users/nicolas/IdeaProjects/JavaTrainingg/src/http/httpAula/test.json");
        byte[] readAllBytes = Files.readAllBytes(arquivoJson);

        // 1. Diz para o navegador ONDE ele deve ir (Cabeçalho Location)
        exchange.getResponseHeaders().add("Content-Type", "application/json; charset=UTF-8");

        // 2. Envia o Código 302 (Redirecionamento) e -1 no tamanho (pois não há texto no corpo)
        exchange.sendResponseHeaders(200, readAllBytes.length);

        try(OutputStream os = exchange.getResponseBody()) {
            os.write(readAllBytes);
        }

        // 3. Fecha a conexão para o navegador executar o pulo
        exchange.getResponseBody().close();
    }
}