package nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZDstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LigthNovel> novels = new ArrayList<>(List.of(new LigthNovel("Dragon Ball daima", 2),
            new LigthNovel("death Note", 6),
            new LigthNovel("High School Dxd", 10),
            new LigthNovel("naruto", 3)));

    public static void main(String[] args) {

        novels.stream().sorted(Comparator.comparing(LigthNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LigthNovel novel : novels) {
            if(novel.getPrice() <= 4){
                titles.add(novel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }

        System.out.println(novels);
        System.out.println(titles);


    }



}
