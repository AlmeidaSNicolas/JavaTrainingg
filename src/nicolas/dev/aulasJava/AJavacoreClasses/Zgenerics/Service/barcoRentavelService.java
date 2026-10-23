package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service;

import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class barcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"), new Barco("iate")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponivel...");
        Barco c = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco : " + c);
        System.out.println("Barco disponiveis para alugar : " + barcosDisponiveis);
        return c;
    }

    public void retornarBarcoAlugado(Barco Barco){
        System.out.println("Devolvendo Barco " + Barco);
        barcosDisponiveis.add(Barco);
        System.out.println("Barco disponiveis para alugar : " + barcosDisponiveis);
    }
}
