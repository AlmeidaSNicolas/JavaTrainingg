package nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExercicios208 {
    private static List<LigthNovel> novels = new ArrayList<>(List.of(new LigthNovel("Dragon Ball daima", 2),
            new LigthNovel("death Note", 1),
            new LigthNovel("High School Dxd", 10),
            new LigthNovel("naruto", 3),
            new LigthNovel("Hxh", 21)
    ));

    public static void main(String[] args) {

        boolean b = novels.stream().anyMatch(ligthNovel -> ligthNovel.getPrice() == 1);
        System.out.println(b);

        boolean b1 = novels.stream().allMatch(ligthNovel -> ligthNovel.getTitle().length() > 5);
        System.out.println(b1);

        boolean b2 = novels.stream().noneMatch(ligthNovel -> ligthNovel.getTitle().isEmpty());
        System.out.println(b2);

        novels.stream().filter(ligthNovel -> ligthNovel.getTitle().contains("a")).map(ligthNovel -> ligthNovel.getTitle()).forEach(System.out::println);

        novels.stream().sorted(Comparator.comparing(LigthNovel::getPrice).reversed()).map(ligthNovel -> ligthNovel.getTitle()).findFirst().ifPresent(System.out::println);

        String titulo = novels.stream()
                .filter(ln -> ln.getPrice() > 100)
                .map(LigthNovel::getTitle)
                .findFirst()
                .orElse("Nenhuma encontrada");
        System.out.println(titulo);

    }

}
