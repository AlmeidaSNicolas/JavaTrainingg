package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Consumidor;
import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.manga;

import java.util.HashMap;
import java.util.Map;

public class mapTest02 {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Nicolas");
        Consumidor consumidor1 = new Consumidor("Pedro");

        manga manga1 = new manga(5L, "dRAGONBALL", 210.00);
        manga manga2 = new manga(5L, "NARUTO", 50);
        manga manga3 = new manga(5L, "hUNTER HUNTER", 300);
        manga manga4 = new manga(5L, "one PIECE", 600);

        Map<Consumidor, manga> consumidormangaMap = new HashMap<>();
        consumidormangaMap.put(consumidor, manga1);
        consumidormangaMap.put(consumidor1, manga2);

        for (Map.Entry<Consumidor, manga>entry : consumidormangaMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        }
}
