package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.test;

import nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.people;
import nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio.imprimir;

public class PessoaTest {
    public static void main(String[] args) {
        people p1 = new people();

        p1.setNome("Maria");
        p1.setIdade(21);
        p1.sexo = 'M';

        imprimir imprime = new imprimir();

        imprimir.imprimir(p1);

    }
}
