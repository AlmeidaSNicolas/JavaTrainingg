package POO.test;

import POO.dominio.Carro;


public class POOtest {
    public static void main(String[] args) {
        Carro car = new Carro();
        Carro car2 = new Carro();

        car.nome = "Ferrari";
        car.modelo = "Ferrari";
        car.ano = 2019;



        car2.nome = "Civic";
        car2.modelo = "Ford";
        car2.ano = 2025;

        System.out.println(" Voce tem um carro " + car.nome + " de modelo: " + car.modelo + " e de ano : " + car.ano);

        System.out.println("E seu outro carro é um " + car2.nome + " DE MODELO " + car2.modelo + " e de ano : " + car2.ano);
    }
}
