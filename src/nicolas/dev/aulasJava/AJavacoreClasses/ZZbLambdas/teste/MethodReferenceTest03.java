package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("Joao", "Heitor", "Pedro","Amanda"));
        strings.sort(String::compareTo);
        System.out.println(strings);

        Function<String, Integer> stringToInteger = Integer::parseInt;
        System.out.println(stringToInteger.apply("10"));

        Predicate<List<String>> checkIsEmpty = List::isEmpty;
        System.out.println("Is empty abajo");
        System.out.println(checkIsEmpty.test(strings));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(strings, "Pedro"));


    }
}
