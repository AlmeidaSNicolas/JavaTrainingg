package nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO.Paciente;

public class pacienteTest {
    public static void main(String[] args) {
        Paciente p1 = new Paciente();

        p1.nome = "Julio";
        p1.idade = 22;
        p1.peso = 100.00;

        p1.imprimirDados();
    }
}
