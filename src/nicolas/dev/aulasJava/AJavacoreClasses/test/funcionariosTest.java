package nicolas.dev.aulasJava.AJavacoreClasses.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO.funcionarios;

public class funcionariosTest {
    public static void main(String[] args) {

        funcionarios f1 = new funcionarios();

        funcionarios f2 = new funcionarios();

        f1.nome = "Nicolas";
        f1.idade = 21;
        f1.salario2 = new double[]{12000, 2130, 4000};

        f2.nome = "Nicolas";
        f2.idade = 21;
        f2.salario2 = new double[]{12000, 210000, 4000};

        f1.imprimirDados();
        f1.media();
        System.out.println("----------------");
        f2.imprimirDados();
        f2.media();


    }
}
