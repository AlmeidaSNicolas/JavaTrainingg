package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.teste;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class lambdaTest01Consumer {
    public static void main(String[] args) {
        List<String> nomesStrings = List.of("Nicolas", "Almeida", "Ana ", "Julia");

        forEach(nomesStrings,(String s) -> System.out.println(s.toUpperCase(Locale.ROOT)));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t: list){
            consumer.accept(t);
        }
    }

}
