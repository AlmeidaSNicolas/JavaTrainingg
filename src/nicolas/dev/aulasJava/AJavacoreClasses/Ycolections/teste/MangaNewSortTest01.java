package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class mangaComparator implements Comparator<manga>{
    @Override
    public int compare(manga manga1, manga manga2) {
        return manga1.getId().compareTo(manga2.getId());

    }
}

public class MangaNewSortTest01 {
    public static void main(String[] args) {

        List<manga> mangas = new ArrayList<>();
        mangas.add(new manga(1L, "Attack on titan", 22));
        mangas.add(new manga(4L, "Naruto", 250));
        mangas.add(new manga(2L, "Dragon Ball", 12.5));
        mangas.add(new manga(3L, "Pokemon", 1));
        mangas.add(new manga(5L, "Hunter x Hunter", 120));

        Collections.sort(mangas, new mangaComparator());

        for (manga animes : mangas){
            System.out.println(animes);
        }


    }
}
