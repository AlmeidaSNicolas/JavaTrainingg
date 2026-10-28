package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LojaTest {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Teclado", 150.0, 10),
                new Produto("Mouse", 40.0, 0),
                new Produto("Monitor", 900.0, 3),
                new Produto("Cabo USB", 15.0, 25),
                new Produto("Headset", 60.0, 0)
        );

        List<Produto> semEstoque = filter(produtos, produto -> produto.getQuantidade() == 0);

        List<Produto> caros = filter(produtos, produto -> produto.getPreco() > 50);

        forEach(caros, produto -> System.out.println(produto.getNome()+ " " + produto.getPreco()));


        List<String> nomes = mapMethod(produtos, produto ->  produto.getNome());

        List<Double> valores = mapMethod(produtos, produto -> produto.getPreco() * produto.getQuantidade());

        System.out.println("Sem estoque : " +semEstoque);
        System.out.println(nomes);
        System.out.println(valores);


    }

    public static <T, R> List<R> mapMethod(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e: list){
            result.add(function.apply(e));

        }
        return result;

    }

    public static <T> void forEach(List<T> list, Consumer<T>consumer){
        for (T e : list){
            consumer.accept(e);
        }
    }


    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filterList = new ArrayList<>();
        for (T e: list){
            if (predicate.test(e)){
                filterList.add(e);
            }
        }
        return filterList;
    }

}
