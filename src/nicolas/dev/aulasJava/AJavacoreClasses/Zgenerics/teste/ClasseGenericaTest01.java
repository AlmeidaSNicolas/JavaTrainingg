package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service.barcoRentavelService;
import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service.barcoRentavelService;
import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Barco;
import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Carro;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        barcoRentavelService barcoRentavelService = new barcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o carro por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);



    }
}
