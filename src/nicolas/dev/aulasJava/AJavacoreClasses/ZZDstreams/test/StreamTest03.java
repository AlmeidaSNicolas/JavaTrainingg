package nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LigthNovel> novels = new ArrayList<>(List.of(new LigthNovel("Dragon Ball daima", 2),
            new LigthNovel("death Note", 6),
            new LigthNovel("High School Dxd", 10),
            new LigthNovel("naruto", 3)));

    public static void main(String[] args) {

        novels.stream().map(LigthNovel::getTitle).forEach(System.out::println);

        long count = novels.stream().filter(ligthNovel -> ligthNovel.getPrice() < 5).count();
        System.out.println(count);

        List<Double> sorted = novels.stream().map(LigthNovel::getPrice).sorted().toList();
        System.out.println(sorted);

        List<String> maiusculos = novels.stream().map(LigthNovel::getTitle).map(String::toUpperCase).sorted().toList();
        System.out.println(maiusculos);

        List<LigthNovel> novelList = novels.stream().sorted(Comparator.comparing(LigthNovel::getPrice).reversed()).limit(2).toList();
        System.out.println(novelList);

        novels.stream().filter(ligthNovel -> ligthNovel.getTitle().toLowerCase(Locale.ROOT).contains("a") && ligthNovel.getPrice() <= 6).map(LigthNovel::getTitle).forEach(System.out::println);




    }
}
