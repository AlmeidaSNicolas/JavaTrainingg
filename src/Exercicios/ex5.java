package Exercicios;

/*
3. Conversor de Temperatura 🌡️Objetivo: Guarde uma temperatura em graus Celsius em uma variável double.Saída esperada:
 Converta para Fahrenheit usando a fórmula $F = (C \cdot 1.8) + 32$.
 Exiba o resultado final formatado com 1 casa decimal, garantindo que a saída pule uma linha no final.
 */

public class ex5 {
    public static void main(String[] args) {

        double grausCelsius = 40;

        double fahrenheit = (grausCelsius * 1.8) + 32;

        System.out.printf("Graus: %.1f acertei? %n", fahrenheit);

    }
}
