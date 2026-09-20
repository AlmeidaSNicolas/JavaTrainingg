package http.httpAula;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class StatusHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {

        exchange.getResponseHeaders().add("Content/Type", "text-plain; CharsetUtf = 8");

        String metodo = exchange.getRequestMethod();
        if (metodo.equalsIgnoreCase("GET")){
            String sucesso = "Metodo GET encontrado!" + exchange.getRequestURI();
            byte[] bytes = sucesso.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(200, sucesso.length());

            try(OutputStream os = exchange.getResponseBody()){
                os.write(bytes);
            }
        }else {
            String mensagemErro = "Apenas GET é permitido";
            byte[] bytes = mensagemErro.getBytes(StandardCharsets.UTF_8);
            exchange.sendResponseHeaders(405, bytes.length);
        }

    }




}
