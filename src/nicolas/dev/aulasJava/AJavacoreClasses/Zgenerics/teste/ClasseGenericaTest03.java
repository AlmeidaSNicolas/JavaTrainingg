package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service.RentalService;
import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Barco;
import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {

        List<Carro> carrosdisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("iate")));

        RentalService<Carro> rentalService = new RentalService<>(carrosdisponiveis);
        RentalService<Barco> barcoRentalService = new RentalService<>(barcosDisponiveis);

        Barco barco = barcoRentalService.buscarObjetoDisponivel();
        barcoRentalService.retornarObjetoAlugado(barco);

        System.out.println("--------");
        Carro carro = rentalService.buscarObjetoDisponivel();
        rentalService.retornarObjetoAlugado(carro);
    }


}
