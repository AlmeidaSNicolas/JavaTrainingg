package nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.Service.Repositorio;
import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Autor;
import nicolas.dev.aulasJava.AJavacoreClasses.Zgenerics.dominio.Carro;


public class TesteRepository {
    public static void main(String[] args) {

        Repositorio<Carro, Integer> repositorio = new Repositorio<>();

        Repositorio<Autor, String> repositorio1 = new Repositorio<>();

        Autor autor = new Autor("Nicholas", "12");
        repositorio1.save("12", autor);
        System.out.println(repositorio1.findAll());
        repositorio1.deletebYid("12");


        System.out.println("Teste com carro abaixo");

        Carro carro = new Carro("Civicao turbu", 12);

        repositorio.save(12, carro);


        Carro carroEncontrado = repositorio.findById(12).orElseThrow(() -> new IllegalArgumentException("Carro nao encontrado"));
        System.out.println(carroEncontrado);

        repositorio.findById(12).ifPresent(s -> System.out.println("Achei : " + s));

        Carro carroPadrão = repositorio.findById(13).orElse(new Carro("Carro padrão", 0));
        System.out.println(carroPadrão);

        Carro carroNaoExiste = repositorio.findById(99).orElseThrow(() -> new IllegalArgumentException("Carro nao existe"));
        System.out.println(carroNaoExiste);

    }
}
