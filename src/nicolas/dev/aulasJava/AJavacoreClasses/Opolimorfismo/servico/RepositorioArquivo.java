package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.servico;

import nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando Arquivos...");
    }
    
}
