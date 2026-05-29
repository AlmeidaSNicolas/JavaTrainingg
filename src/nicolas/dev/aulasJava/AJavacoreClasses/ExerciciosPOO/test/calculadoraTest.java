package nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO.test;

import nicolas.dev.aulasJava.AJavacoreClasses.dominio.calculadora;

public class calculadoraTest {
    public static void main(String[] args) {
        calculadora c = new calculadora();
        int[] numeros = {1,2,3,4,89};
        c.somaArray(numeros);
    }
}
