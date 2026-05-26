package nicolas.dev.aulasJava.AJavacoreClasses.test;

import nicolas.dev.aulasJava.AJavacoreClasses.dominio.carro;
import nicolas.dev.aulasJava.AJavacoreClasses.dominio.imprimir2;

public class carro2Test {
    public static void main(String[] args) {
        carro carro = new carro();

        imprimir2 imprime = new imprimir2();

        carro.modelo = ("Fordka");
        carro.placa = 1;
        carro.documento = "Fordka";
        carro.cor = "Pretao azul ";

        carro car2 = new carro();
        car2.modelo = "Ferrari";
        car2.placa = 20359;
        car2.documento = "Tu tiene una entonces tiene que ser una buena persona";
        car2.cor= "Vermelhao sangue";
        car2.setConta(12000);
        car2.setDadosMotorista("Joaozin da padoca");

        imprime.imprimir2(car2);

    }
}
