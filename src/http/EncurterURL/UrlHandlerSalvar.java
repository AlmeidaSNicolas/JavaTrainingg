package http.EncurterURL;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class UrlHandlerSalvar implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

       if (!exchange.getRequestMethod().equalsIgnoreCase("POST")){
           exchange.sendResponseHeaders(405, -1);
           exchange.close();
           return;
       }

       byte[] bytesCorpo = exchange.getRequestBody().readAllBytes();
       String urlOriginal = new String(bytesCorpo, StandardCharsets.UTF_8).trim();
       String random = UUID.randomUUID().toString().substring(0, 6);

       UrlShortenerService.salvarUrl(random, urlOriginal);

       String retorno = "http://localhost:8080/r/" + random;
       byte[] bytes = retorno.getBytes(StandardCharsets.UTF_8);

        exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=utf-8");
       exchange.sendResponseHeaders(200, bytes.length);

       try(OutputStream os = exchange.getResponseBody()){
           os.write(bytes);
       }catch (IOException e){
           System.out.println(e);
       }

    }
}
