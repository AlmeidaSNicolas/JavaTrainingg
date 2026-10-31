package nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest04 {
    private static List<LigthNovel> novels = new ArrayList<>(List.of(new LigthNovel("Dragon Ball daima", 2),
            new LigthNovel("death Note", 1),
            new LigthNovel("High School Dxd", 10),
            new LigthNovel("naruto", 3)
    ));

    public static void main(String[] args) {

        boolean b = novels.stream().anyMatch(ligthNovel -> ligthNovel.getPrice() > 8);
        System.out.println(b);

        boolean b1 = novels.stream().allMatch(ligthNovel -> ligthNovel.getPrice() > 0);
        System.out.println(b1);

        boolean b2 = novels.stream().allMatch(ligthNovel -> ligthNovel.getTitle().contains("a"));
        System.out.println(b2);

        boolean b3 = novels.stream().noneMatch(ligthNovel -> ligthNovel.getPrice() < 0);
        System.out.println(b3);

        novels.stream().filter(ligthNovel -> ligthNovel.getPrice() > 3).findAny().ifPresent(System.out::println);

        novels.stream().filter(ligthNovel -> ligthNovel.getPrice() > 2).sorted(Comparator.comparing(LigthNovel::getPrice)).findFirst().ifPresent(System.out::println);
    }
}
