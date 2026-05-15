package Exercicios;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Exglobal2 {
    public static void main(String[] args) {
        int[] capacidades = {150, 200, 80, 320, 500, 450, 100};
        int soma = 0;

        int[] aviesGrandes = new int[capacidades.length];
        int contadoGrande = 0;

        for (int capacidade: capacidades){

            if(capacidade <= 150){
                soma += capacidade;
                System.out.println("Aviao de pequeno porte:  " + capacidade + " Passageiros");

            }else if(capacidade <= 320 ){
                System.out.println("Aviao de Medio porte: " + capacidade + " Passageiros");
                soma += capacidade;
            }else if(capacidade > 320){
                System.out.println("Aviao de Grande porte: " + capacidade + " Passageiros");
                soma += contadoGrande;
            }
        }


        System.out.println("------------------------------------");
        System.out.println("Podemos levar ao todo: " + soma + " Passageiros");
        System.out.println("Nossas naves grandes sao: " + aviesGrandes[contadoGrande]);

        int[] numeros = {10,20,30,40};
        int soma1 = 0;
        for(int n: numeros){
            soma1 += n;
        }
        System.out.println("valor da soma é: " + soma1);

        /*
        Dado um array de Strings contendo nomes de frutas (ex: "Maçã", "Banana", "Manga", "Uva"),
         utilize o for-each para percorrer o array e imprimir apenas os nomes que começam com a letra "M".
         */

        String[] frutas = {"Maça", "banana", "Manga", "uva"};

        Arrays.stream(frutas).filter(f -> f.startsWith("M")).forEach(System.out::println);


        /*
        Exercício 1: O Somador de Estoque
        Crie um array de números inteiros representando a quantidade de produtos em diferentes prateleiras.
        Use o for-each para calcular o total de produtos no depósito e imprima o resultado.
         */

        int[] quantidade = {10, 20, 50, 80, 10};
        int soma3 = 0;

        for(int n: quantidade){
            soma3 += n;
            System.out.println(n);
        }
        System.out.println("Seu resultado é : " + soma3);

        /*
        Exercício 2: O Localizador de Negativos
        Dado um array de temperaturas (pode usar double ou int),
        percorra-o com for-each e imprima apenas as temperaturas que forem menores que zero.
         */

        double[] temperatura = {-10, 20, 21, -5, 30, -4};

        Arrays.stream(temperatura).filter(t -> t < 0).forEach(System.out::println);

        /*
        Exercício 4: Verificador de Aprovação
        Crie um array com as notas de um aluno (tipo double). Use o for-each para verificar se alguma das notas é
        menor que 5.0. Se encontrar, imprima um aviso: "Atenção: Nota abaixo da média detectada!".
         */

        double[] notas = {10, 9, 4, 8};
        Arrays.stream(notas).filter(n -> n < 5).forEach(System.out::println);
        for(double nota: notas){
            if( nota < 5){
                System.out.println("Atençao!! nota: " + nota + " Esta a baixo da media ");
            }
        }


    }
}
