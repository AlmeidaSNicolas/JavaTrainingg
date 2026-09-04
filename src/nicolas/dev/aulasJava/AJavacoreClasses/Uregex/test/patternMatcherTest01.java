package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherTest01 {
    public static void main(String[] args) {



        String regex = "\\W";
        String texto = "hh321kj @#$ _12";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
