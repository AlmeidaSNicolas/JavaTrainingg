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


        Carro carroEncontrado = repositorio.findById(12);
        System.out.println(repositorio.findAll());
        System.out.println("Find : " + carroEncontrado);
        System.out.println(repositorio.findById(99));
        repositorio.deletebYid(12);
    }
}
