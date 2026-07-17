package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.test;


import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.repositorio.Repositorio;
import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {

        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

    }
}
