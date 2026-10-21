package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExCompareTo {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(33);
        numeros.add(45);
        numeros.add(50);
        numeros.add(600);

        Collections.sort(numeros);
        Collections.reverse(numeros);

        for (Integer nums : numeros){
            System.out.println(nums);
        }

        List<String> strings = new ArrayList<>();

        strings.add("banana");
        strings.add("Abacaxi");
        strings.add("uva");
        strings.add("Morangp");
        strings.add("laranja");

        Collections.sort(strings);
        Collections.sort(strings, String.CASE_INSENSITIVE_ORDER);


        for (String strgs : strings){
            System.out.println(strgs);
        }

    }
}
