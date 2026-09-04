
package nicolas.dev.aulasJava.AJavacoreClasses.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternMatcherTest04 {
    public static void main(String[] args) {

        // \d = Todos os digitos
        // \D = tudo que nao é digito no caso: letras / caracteres especiais
        // \s = Todo espaco em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos (espaços em branco)
        // \w = Tudo que for de a-ZA-Z, digitos, _
        // \W = Contrario do minusculo, traz tudo que nao for incluso no w(minusculo) caracteres especiais, espaços em branco
        // Range []

        //Quantificadores
        // ? Zero ou Uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de N até M (1 ate 6);
        // () metacaracter de agrupamento
        // |
        // $ fim da linha
        // . 1.3 = 123 = 133 =1@3 = 1A3 = Expressao que procura entre


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+\\.([a-zA-Z])+";
        String texto = "luffy@gmail.com, 145nicolas@gmail.com, #$5endou@mail.com, goenji@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Posições encontradas");

        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }


    }
}
