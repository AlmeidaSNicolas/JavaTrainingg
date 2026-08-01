package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.runtime.test;

import org.w3c.dom.ls.LSOutput;

public class RunTimeException02 {

    public static void main(String[] args) {
        System.out.println(divisao(109,23));
        System.out.println(idadeMaiorMenor(109));
    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new RuntimeException("Argumento aritmeticamente invalido");
        }
        return a/b;
    }

    private static int idadeMaiorMenor(int idade){
        if(idade >= 100){
            throw new IllegalArgumentException("Idade Impossivel para um ser humano");
        }
        return idade;
    }
}
