package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio.Catalago;
import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.dominio.Produto;

public class testLoja {
    public static void main(String[] args) {

        int count = 0;

        while(count < 50){
            if (count % 3 == 0){
                System.out.println("backend");
            }
            if (count % 5 == 0){
                System.out.println("Frontend");
            }
            if(count % 3 == 0|| count % 5 == 0){
                System.out.println("Fullstack");
            }
            count = count + 1;
        }

    }
}
