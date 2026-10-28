package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.Exercicios;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex1 {
    public static void main(String[] args) {


        Predicate<String> temArroba = email -> email.contains("@");

        System.out.println(temArroba.test("nicolas@gmail.con"));
        System.out.println(temArroba.test("nicolas.con"));


        Consumer<String> saudacao = nome -> System.out.println("Ola " + nome + "!");
        saudacao.accept("Ana Juia");

        Consumer<Integer> numero = nums -> System.out.println("Seu numero : " + nums);
        numero.accept(1);


        Function<String, Integer> contaLetras = palavra -> palavra.length();
        System.out.println(contaLetras.apply("Javeiro"));

        Function<Double, Double> desconto = preco -> preco * 0.9;
        System.out.println(desconto.apply(100.0));

    }
}
