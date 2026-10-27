package nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class lambdaFixacaoTest {

    private static List<Car> carsList = List.of(new Car("green", 2009), new Car("black", 2025), new Car("red", 2019), new Car("Black", 1999));

    private static List<String> nameslist = List.of("Nicolas", "Joao", "Natalia", "Nicolle", "Navi", "Kenai");

    public static void main(String[] args) {

        System.out.println(genericFilter(carsList, car -> car.getColor().equalsIgnoreCase("black")));

        System.out.println(genericFilter(carsList, car -> car.getColor().equalsIgnoreCase("black") || car.getYear() > 2018));

        List<String> nomesComN = genericFilter(nameslist, name -> name.startsWith("N"));
        System.out.println("Nomes : " + nomesComN);

        List<String> namesWithMore4letter = genericFilter(nameslist, name -> name.length() > 4);
        System.out.println("Names has more then 4 letters " + namesWithMore4letter);

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
