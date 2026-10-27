package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambidaTest02Function {
    public static void main(String[] args) {
        List<String> strings = List.of("Illaoi", "Yasuo");

        List<Integer> integers = map(strings,(String s) -> s.length());
        List<Integer> integersComMethodReference = map(strings, String::length);

        List<String> mapUpper = map(strings, String::toUpperCase);

        System.out.println(integers);
        System.out.println(mapUpper);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function){
        List<R> result = new ArrayList<>();
        for (T e: list){
            R r = function.apply(e);
            result.add(r);
        }
    return result;
    }

}
