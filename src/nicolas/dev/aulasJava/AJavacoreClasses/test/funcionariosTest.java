package nicolas.dev.aulasJava.AJavacoreClasses.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO.funcionarios;

public class funcionariosTest {
    public static void main(String[] args) {

        funcionarios f1 = new funcionarios();

        funcionarios f2 = new funcionarios();

        f1.setNome("Nicolas");
        f1.setIdade(21);
        f1.setSalario2(new double[]{1000, 2130, 3500});

        f2.setNome("Pedro");
        f2.setIdade(20);
        f2.setSalario2(new double[]{1000, 2000, 4000});

        f1.imprimirDados();
        f1.media();
        System.out.println("----------------");
        f2.imprimirDados();
        f2.media();


    }
}
