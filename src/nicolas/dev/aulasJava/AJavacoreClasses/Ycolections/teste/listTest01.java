package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import java.util.ArrayList;
import java.util.List;

public class listTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Nicolas");
        nomes.add("lucas");


        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

    }
}
