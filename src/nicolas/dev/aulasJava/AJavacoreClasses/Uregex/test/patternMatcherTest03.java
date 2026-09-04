package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherTest03 {
    public static void main(String[] args) {

        // \d = Todos os digitos
        // \D = tudo que nao é digito no caso: letras / caracteres especiais
        // \s = Todo espaco em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos (espaços em branco)
        // \w = Tudo que for de a-ZA-Z, digitos, _
        // \W = Contrario do minusculo, traz tudo que nao for incluso no w(minusculo) caracteres especiais, espaços em branco
        // Range []

        String regex = "[a-b-A-B-A-C]";
        String texto = "aBACateor";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.println(matcher.start() +"");
        }


    }
}
