package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        Set<manga> mangas = new HashSet<>();

        mangas.add(new manga(1L, "Attack on titan", 22));
        mangas.add(new manga(4L, "Naruto", 250));
        mangas.add(new manga(2L, "Dragon Ball", 12.5));
        mangas.add(new manga(3L, "Pokemon", 1));
        mangas.add(new manga(5L, "Hunter x Hunter", 120));

        for (manga manga: mangas){
            System.out.println(manga);
        }

    }
}
