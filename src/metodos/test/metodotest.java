package metodos.test;

import metodos.metodos;

public class metodotest {
    public static void main(String[] args) {
        metodos calcu = new metodos();

        calcu.somaNumeros();
        calcu.subtrairNum();

        System.out.println("Multiplicando abaixo");
        calcu.multiplaNumeros(12,2);

        System.out.println("Dividindo abaixo");
        double result = calcu.dividirNum(12,2);
        System.out.println(result);
    }
}
