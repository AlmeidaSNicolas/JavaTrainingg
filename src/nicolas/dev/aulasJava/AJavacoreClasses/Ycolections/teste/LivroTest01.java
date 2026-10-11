package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Biblioteca;
import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Emprestimo;
import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Livro;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LivroTest01 {
    public static void main(String[] args) {

        Livro l1 = new Livro("alice no pais das maravilhas", "nao sei", 1999);
        Livro l2 = new Livro("alice no pais das maravilhas", "nao sei", 1999);

        System.out.println(l1 == l2);
        System.out.println(l1.equals(l2));

        Livro l3 = new Livro("Jogos mortais", "henry ford", 1970);

        String objOutrotIPO = "outroTipo";

        System.out.println("Comparando com null : " + l3.equals(null));
        System.out.println("Comparando com outro tipo : " + l3.equals(objOutrotIPO));

        Set<Livro> set = new HashSet<>();
        set.add(new Livro("Os tres porquinhos", "nao sei2 ", 2000));
        set.add(new Livro("Os tres anoes", "nao sei3 ", 1987));
        System.out.println(set.size());

        Emprestimo emprestimo = new Emprestimo(l3, "sadasd", LocalDate.now());

    }
}
