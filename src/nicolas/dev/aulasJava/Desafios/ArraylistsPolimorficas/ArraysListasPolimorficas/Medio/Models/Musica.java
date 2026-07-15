package nicolas.dev.aulasJava.Desafios.ArraylistsPolimorficas.ArraysListasPolimorficas.Medio.Models;

public class Musica {
    String titulo;
    String artista;


    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    void imprimirMusica(){
        System.out.println("Dados da musca: ");
        System.out.println("Nome : " + this.titulo);
        System.out.println("Artista : " + this.artista);
    }
}
