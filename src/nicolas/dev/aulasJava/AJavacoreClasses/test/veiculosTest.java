package nicolas.dev.aulasJava.AJavacoreClasses.test;

import nicolas.dev.aulasJava.AJavacoreClasses.dominio.veiculo;

public class veiculosTest {
    public static void main(String[] args) {

        veiculo carro1 = new veiculo("AN1108", "Ford", "Fastbak", 100, 10);

        System.out.print("Seu carro tem esses dados : " + carro1.getMarca() + " modelo : " + carro1.getModelo() + "\n tendo a placa de numero : " + carro1.getPlaca() + " e a capidade de tanque de: " + carro1.getCapacidadeTanque() + "E um consumo de " + carro1.getConsumo() + " Por km");

       veiculo carro = new veiculo("tt", "tt", "tt", 123,125);


    }
}
