package nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.dominio.Car;
import nicolas.dev.aulasJava.AJavacoreClasses.ZZAcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {

    private static List<Car> carsList = List.of(new Car("green", 2009), new Car("black", 2025), new Car("red", 2019));

    public static void main(String[] args) {

       List<Car> greenCars = filter(carsList, new CarPredicate() {
           @Override
           public boolean test(Car car) {
               return car.getColor().equals("green");
           }
       });

        List<Car> oldCars = filter(carsList, car -> car.getYear() < 2026);
        System.out.println("Carros old " + oldCars);

        System.out.println(greenCars);
        System.out.println();
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate){
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars){
            if (carPredicate.test(car)){
                filterCar.add(car);
            }
        }
        return filterCar;
    }

}
