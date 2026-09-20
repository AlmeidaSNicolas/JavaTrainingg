package http.EncurterURL;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class RedirecionarHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

    if (!exchange.getRequestMethod().equalsIgnoreCase("GET")){
        exchange.sendResponseHeaders(405, -1);
        return;
    }

    String codigoExtraido = exchange.getRequestURI().getPath().replace("/r/", "").trim();

    String urlOriginal = UrlShortenerService.buscarUrlOriginal(codigoExtraido);

    if (urlOriginal != null){
        exchange.getResponseHeaders().add("Location", urlOriginal);
        exchange.sendResponseHeaders(302, -1);
        exchange.close();
    }else {

        exchange.getResponseHeaders().add("Content-Type", "text/plain; charsetUtf=-8");
        String naoEncontrada = "URL nao encontrada";
        byte[] bytes = naoEncontrada.getBytes(StandardCharsets.UTF_8);

        exchange.sendResponseHeaders(404, bytes.length);

        try (OutputStream os = exchange.getResponseBody()) {
            os.write(bytes);
        } catch (IOException e) {
            System.out.println(e);
        }


    }


    }
}
