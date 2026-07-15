package nicolas.dev.aulasJava.Desafios.ArraylistsPolimorficas.ArraysListasPolimorficas.Medio.Teste;

import nicolas.dev.aulasJava.Desafios.ArraylistsPolimorficas.ArraysListasPolimorficas.Medio.Models.Musica;

import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {

        List<Musica> playlist = new ArrayList<>();

        playlist.add(new Musica("SLa", "MC BIN LADEN"));
        playlist.add(new Musica("Vai sentando", "mc gw"));
        playlist.add(new Musica("Luz", "LuzMC"));
        playlist.add(new Musica("Luz", "AguaMC"));

        playlist.set(1 = new Musica("Vai safada", "Mc canalha"));

        playlist.remove(2);

        Musica hit = new Musica("Chitanzin e borogodo", "Vai canalha");

        playlist.add(hit);

        if(playlist.contains(hit)){
            System.out.println("Musica encontrada krlhh" );
        }else{
            System.out.println("Musica nao encontrada bb");
        }

        System.out.println("Limapndo essa bagunça...");
        playlist.clear();

        System.out.println("COmprovando q ta limpa seus comedia");
        playlist.size();

    }

}
