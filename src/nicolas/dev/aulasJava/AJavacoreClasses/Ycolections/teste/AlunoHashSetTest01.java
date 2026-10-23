package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Aluno;
import nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.dominio.Aluno2;

import java.util.HashSet;
import java.util.Set;

public class AlunoHashSetTest01 {
    public static void main(String[] args) {

        Set<Aluno2> aluno2s = new HashSet<>();
        aluno2s.add(new Aluno2("matricula1", "nicolas1"));
        aluno2s.add(new Aluno2("matricula1", "pedro"));
        aluno2s.add(new Aluno2("matricula1", "heitor"));

        System.out.println(aluno2s);


    }
}
