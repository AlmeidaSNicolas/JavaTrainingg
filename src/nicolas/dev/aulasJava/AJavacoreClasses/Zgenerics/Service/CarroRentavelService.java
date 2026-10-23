package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service;

import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosdisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("mercedes")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carro disponivel...");
        Carro c = carrosdisponiveis.remove(0);
        System.out.println("Alugando carro : " + c);
        System.out.println("Carros disponiveis para alugar : " + carrosdisponiveis);
        return c;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro " + carro);
        carrosdisponiveis.add(carro);
        System.out.println("Carros disponiveis para alugar : " + carrosdisponiveis);
    }
}
