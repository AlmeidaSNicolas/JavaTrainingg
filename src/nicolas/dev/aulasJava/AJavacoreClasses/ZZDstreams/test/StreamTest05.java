package nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.dominio.Category;
import nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest05 {
    private static List<LigthNovel> novels = new ArrayList<>(List.of(new LigthNovel("Dragon Ball daima", 2, Category.FANTASY),
            new LigthNovel("death Note", 1, Category.FANTASY),
            new LigthNovel("High School Dxd", 10, Category.ROMANCE),
            new LigthNovel("naruto", 3, Category.DRAMA),
            new LigthNovel("HXH", 21, Category.FANTASY)
    ));
    public static void main(String[] args){

        Map<Category, List<LigthNovel>> collect = novels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory));
        System.out.println(collect);

    }
}
