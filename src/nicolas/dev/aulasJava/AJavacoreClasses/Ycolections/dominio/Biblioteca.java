package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    private final Set<Emprestimo> emprestimoHashSet = new HashSet<>();

    public boolean registrar(Emprestimo e){
        return emprestimoHashSet.add(e);
    }

    public boolean devolver(Livro livro, String cpfLeitor){

        Emprestimo busca = new Emprestimo(livro, cpfLeitor, LocalDate.now());
        return emprestimoHashSet.remove(busca);



    }
}
