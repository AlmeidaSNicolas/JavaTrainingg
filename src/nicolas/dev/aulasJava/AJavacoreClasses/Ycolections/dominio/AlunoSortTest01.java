package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Fica no pacote dominio porque os comparators de Aluno não são public,
// então só são visíveis dentro deste pacote.
public class AlunoSortTest01 {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(3L, "carla", 7));
        alunos.add(new Aluno(1L, "Bruno", 9.5));
        alunos.add(new Aluno(5L, "Ana", 5));
        alunos.add(new Aluno(2L, "Davi", 9.5));
        alunos.add(new Aluno(4L, "Eduarda", 8));

        System.out.println("--- Por matrícula (compareTo) ---");
        Collections.sort(alunos);
        imprimir(alunos);

        System.out.println("--- Por nome ---");
        Collections.sort(alunos, new ALunoPorNomeComparator());
        imprimir(alunos);

        System.out.println("--- Por nota (maior para menor) ---");
        Collections.sort(alunos, new AlunoPorNotaComparator());
        imprimir(alunos);

        System.out.println("--- Validações do construtor ---");
        try {
            new Aluno(6L, "Fulano", 11);
        } catch (IllegalArgumentException e) {
            System.out.println("Nota 11: " + e);
        }

        try {
            new Aluno(7L, "Ciclano", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Nota -1: " + e);
        }

        try {
            new Aluno(8L, null, 5);
        } catch (NullPointerException e) {
            System.out.println("Nome null: " + e);
        }

        try {
            new Aluno(null, "Beltrano", 5);
        } catch (NullPointerException e) {
            System.out.println("Matrícula null: " + e);
        }
    }

    static void imprimir(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getRegistration() + " - " + aluno.getName() + " - " + aluno.getNota());
        }
    }
}
