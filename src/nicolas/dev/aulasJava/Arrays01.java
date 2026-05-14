package nicolas.dev.aulasJava;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        int[] idade = new int[3];

        idade = new int[]{19, 21, 22};
        System.out.println(idade[1]);

        int[] valores = new int[5];

        valores[0] = 1;
        valores[1] = 2;
        valores[2] = 3;
        valores[3] = 4;
        valores[4] = 5;

        int somaTotal = valores[0] + valores[1] + valores[2] + valores[3] +  valores[4] ;
        System.out.println("Soma dos valores é : " + somaTotal );

        String[] nomes = new String[5];

        nomes[0] = " Java ";
        nomes[1] = " Typescript ";
        nomes[2] = " Node ";
        nomes[3] = " React ";
        nomes[4] = " Spring ";

        System.out.println("Ordem inversa: " + nomes[ 4 ] + nomes[ 3 ] + nomes[ 2 ] + nomes[ 1 ] + nomes[ 0 ] );

        String[] nomes2 = new String[3];

        nomes2[0] = "Nicolas";
        nomes2[1] = "Ana julia";
        nomes2[2] = "Anthony";

        System.out.println(Arrays.toString(nomes2));

        Arrays.stream(nomes2).filter(n -> n.startsWith("A")).forEach(n -> System.out.println(n));



    }
}