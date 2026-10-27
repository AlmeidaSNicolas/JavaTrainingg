package nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.teste;

import nicolas.dev.aulasJava.AJavacoreClasses.ZZbLambdas.Interfaces.Calculadora;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculadora soma = ((x, y) -> x + y);

        System.out.println(soma.count(1,2));

        Calculadora multiplicacao = (((x, y) -> x * y));

        System.out.println(multiplicacao.count(2,2));

        Calculadora maiorEntreOsDois = ((x, y) -> x > y ? x : y);

        System.out.println(maiorEntreOsDois.count(10,1));

        System.out.println(maiorEntreOsDois.count(1,10));

    }

}
