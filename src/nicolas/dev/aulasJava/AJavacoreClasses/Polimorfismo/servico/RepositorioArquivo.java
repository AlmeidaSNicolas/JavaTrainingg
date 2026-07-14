package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.servico;

import nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando Arquivos...");
    }
    
}
