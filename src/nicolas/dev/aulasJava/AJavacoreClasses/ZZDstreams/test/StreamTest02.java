package nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LigthNovel> novels = new ArrayList<>(List.of(new LigthNovel("Dragon Ball daima", 2),
            new LigthNovel("death Note", 6),
            new LigthNovel("High School Dxd", 10),
            new LigthNovel("naruto", 3)));

    public static void main(String[] args) {

        List<String> collect = novels.stream().sorted(Comparator.comparing(LigthNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4).limit(3)
                .map(LigthNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(collect);

        List<LigthNovel> caras = novels.stream().filter(ln -> ln.getPrice() > 4).limit(4).collect(Collectors.toList());
        System.out.println(caras);
        System.out.println("caras streams acima");



    }
}
