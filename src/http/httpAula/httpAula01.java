package http.httpAula;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class httpAula01 {
    public static void main(String[] args) throws IOException {

        HttpServer httpServer = HttpServer.create(new InetSocketAddress(8080), 0);
        httpServer.createContext("/status", new StatusHandler());
        httpServer.setExecutor(null);
        System.out.println("Servidor HTTP rodando na porta 8080...");
        httpServer.start();



    }
}
