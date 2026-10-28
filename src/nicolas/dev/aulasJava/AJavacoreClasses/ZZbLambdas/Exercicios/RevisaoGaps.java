package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.Exercicios;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.dominio.Car;
import nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RevisaoGaps {
    public static void main(String[] args) {

        Predicate<Integer> emEstoque = quantidade -> quantidade > 0;
        System.out.println(emEstoque.test(5));
        System.out.println(emEstoque.test(0));

        Consumer<String> enviarEmail = nomeCliente -> System.out.println("Enviando email para : " + nomeCliente);
        enviarEmail.accept("Nicolas");
        enviarEmail.accept("Ana Julia");

        Function<Double, Double>realParaEuros = valor1 -> valor1 / 6.0;
        System.out.println(realParaEuros.apply(100.0));

        Function<String, String> maiscula = palavra -> palavra.toUpperCase();
        String gritando = maiscula.apply("nicolas");
        System.out.println(gritando + "!!!");

        Function<String, Integer> tamanho = palavra -> palavra.length();
        Function<String, Integer> tamanho2 = String::length;

        List<Integer> quantidades = List.of(5,0,12,0,3);
        System.out.println(filter(quantidades, emEstoque));

    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> tList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                tList.add(e);
            }
        }
        return tList;
    }


}



