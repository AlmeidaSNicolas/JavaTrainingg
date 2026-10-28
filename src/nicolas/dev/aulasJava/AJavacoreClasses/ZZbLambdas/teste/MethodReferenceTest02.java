package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.dominio.Anime;
import nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {

        AnimeComparators animeComparators = new AnimeComparators();

        List<Anime> animes = new ArrayList<>(List.of(new Anime("Attack on titan", 20), new Anime("Berseak", 10), new Anime("One piece", 1500)));
        animes.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animes);


    }
}
