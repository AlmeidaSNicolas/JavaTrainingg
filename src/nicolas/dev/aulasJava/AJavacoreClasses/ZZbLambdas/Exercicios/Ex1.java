package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.Exercicios;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex1 {
    public static void main(String[] args) {


        Predicate<String> temArroba = email -> email.contains("@");

        System.out.println(temArroba.test("nicolas@gmail.con"));
        System.out.println(temArroba.test("nicolas.con"));



    }
}
