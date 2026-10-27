package nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoParametro3 {

    private static List<Integer> numbersList = List.of(1,2,3,4,5,6,7,10,100,20000);

    public static void main(String[] args) {

        System.out.println(genericFilter(numbersList, nums -> nums > 10));

        System.out.println(genericFilter(numbersList, nums -> nums % 2 == 0));
    }

    private static <T> List<T> genericFilter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }

}
