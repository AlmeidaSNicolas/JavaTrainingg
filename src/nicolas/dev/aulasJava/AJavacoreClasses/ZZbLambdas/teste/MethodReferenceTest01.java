package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.dominio.Anime;
import nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {

        List<Anime> animes = new ArrayList<>(List.of(new Anime("Attack on titan", 20), new Anime("Berseak", 10), new Anime("One piece", 1500)));

        List<Anime> animes2 = List.of(new Anime("Naruto", 220), new Anime("Bleach", 366));



        //Collections.sort(animes, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
        Collections.sort(animes, AnimeComparators::compareByTitle);
        Collections.sort(animes, AnimeComparators::compareByEpisodes);

        Collections.sort(animes, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));




    }
}
