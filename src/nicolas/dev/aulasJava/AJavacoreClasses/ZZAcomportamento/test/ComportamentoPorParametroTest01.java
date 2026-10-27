package nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    private static List<Car> carsList = List.of(new Car("green", 2009), new Car("black", 2025), new Car("red", 2019));

    public static void main(String[] args) {

        System.out.println(filterCarByColor(carsList, "green"));
        System.out.println(filterCarByColor(carsList, "red"));

        System.out.println(filterCarByYear(carsList, 2020));
    }

    private static List<Car> filterCarByColor(List<Car>cars, String color){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals(color)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterCarByYear(List<Car>cars, int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() < year){
                oldCars.add(car);
            }
        }
        return oldCars;
    }
}
