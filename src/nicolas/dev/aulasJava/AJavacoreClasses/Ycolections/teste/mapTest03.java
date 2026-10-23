package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Consumidor;
import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.manga;

import java.util.*;

public class mapTest03 {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Nicolas");
        Consumidor consumidor1 = new Consumidor("Pedro");

        manga manga1 = new manga(5L, "dRAGONBALL", 210.00);
        manga manga2 = new manga(5L, "NARUTO", 50);
        manga manga3 = new manga(5L, "hUNTER HUNTER", 300);
        manga manga4 = new manga(5L, "one PIECE", 600);


        List<manga> listaMangasConsumidor1 = List.of(manga1, manga2, manga3);
        List<manga> listaMangaConsumidor2 = List.of(manga4);
        Map<Consumidor, List<manga>> consumidormangaMap = new HashMap<>();
        consumidormangaMap.put(consumidor, listaMangasConsumidor1);
        consumidormangaMap.put(consumidor1, listaMangaConsumidor2);

        for (Map.Entry<Consumidor, List<manga>>entry : consumidormangaMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            for (manga mangA : entry.getValue()){
                System.out.println(mangA.getNomeManga());
            }
        }




        }


}
