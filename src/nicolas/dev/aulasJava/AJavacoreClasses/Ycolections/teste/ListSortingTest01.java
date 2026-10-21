package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingTest01 {
    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>(6);

        mangas.add("Attack on titan");
        mangas.add("One piece");
        mangas.add("DBZ");
        mangas.add("Hunter x Hunter");
        mangas.add("pokjemon");

        Collections.sort(mangas);

        for (String manga : mangas){
            System.out.println(manga);
        }


    }
}
