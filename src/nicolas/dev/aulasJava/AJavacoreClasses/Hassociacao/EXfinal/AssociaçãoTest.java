package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.EXfinal;

import java.util.Scanner;

public class AssociaçãoTest {
    public static void main(String[] args) {

        Local l1 = new Local("Laredo Cantabria");
        Aluno a1 = new Aluno("Nicolas", 21);
        Professor p1 = new Professor("RABICO", "PromptEnginnerg");
        Aluno[] alunosParaSeminario = {a1};
        Seminario s1 = new Seminario("Engenharia de software", alunosParaSeminario, l1);

    }
}
