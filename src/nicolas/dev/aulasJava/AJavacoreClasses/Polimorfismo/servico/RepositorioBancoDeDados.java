package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.servico;

import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando Dados...");
    }
}
