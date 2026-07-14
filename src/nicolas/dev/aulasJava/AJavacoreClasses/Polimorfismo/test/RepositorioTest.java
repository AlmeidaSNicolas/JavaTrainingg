package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.test;


import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.repositorio.Repositorio;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.servico.RepositorioArquivo;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.servico.RepositorioBancoDeDados;
import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

    }
}
