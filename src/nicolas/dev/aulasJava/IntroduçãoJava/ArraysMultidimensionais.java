package nicolas.dev.aulasJava.IntroduçãoJava;

public class ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] idade = new int[3][3];


        idade[0][0] = 1;
        idade[0][1] = 2;
        idade[0][2] = 3;

        idade[1][0] = 4;
        idade[1][1] = 5;
        idade[1][2] = 6;

        idade[2][0] = 7;
        idade[2][1] = 8;
        idade[2][2] = 9;

        int soma = idade[2][0] + idade[2][1] + idade[2][2];

        /*
        for (int i = 0; i < idade.length; i++) {

            for (int j = 0; j < idade[i].length; j++) {
                System.out.println(idade[i][j] );
            }
        }
        */


        for(int[] arr: idade){
            for(int num: arr){
                System.out.println(num);
            }
        }

        /*
        🧮 Soma Total da Matriz: Utilizando a estrutura de dois laços for aninhados que você já domina,
        crie uma variável int somaTotal para acumular a soma de todos os 9 elementos da matriz e exiba o resultado final.
         */

        int[][] numeros = new int[3][3];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;

        numeros[1][0] = 4;
        numeros[1][1] = 5;
        numeros[1][2] = 6;

        numeros[2][0] = 7;
        numeros[2][1] = 8;
        numeros[2][2] = 9;

        int somaTotal = 0;

        for(int[] arr: numeros){
            for(int num: arr){
                somaTotal += num;
                System.out.println("O resultado da soma é : " + somaTotal);
            }
        }

        System.out.println();




    }
}
