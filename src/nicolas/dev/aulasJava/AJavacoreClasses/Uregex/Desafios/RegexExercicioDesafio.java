package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.Desafios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercicioDesafio {
    public static void main(String[] args) {

        String regex = "102|450|999999999999";
        String texto = "O pedido 102 foi processado. Valor: 450 reais. Código de erro: 999999999999.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()){
            System.out.println(matcher.start() + " ");
        }


    }
}
