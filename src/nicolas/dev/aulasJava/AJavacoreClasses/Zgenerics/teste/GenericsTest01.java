package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.teste;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        List lista = new ArrayList<>();
        lista.add(10);
        for (Object o : lista){
            String s = (String) o;
        }

        //List<String> nomes = new ArrayList<>();
        //nomes.add(10);
    }
}
