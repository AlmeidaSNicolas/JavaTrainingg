package nicolas.dev.aulasJava;

import java.util.Arrays;

public class ArraysMultidimensionais2 {
    public static void main(String[] args) {

        int[][] teste = new int[3][];

        teste[0] = new int[2];
        teste[1] = new int[3];
        teste[2] = new int[6];

        int[][] array2 =  {{0,0}, {1,2,3}, {1,2,3,4,5,6}};

        for(int[] arrayBase: array2){
            System.out.println("\n------");
            for(int num: arrayBase){
                System.out.println(num + "  ");
            }
        }
        }



        // corrigido pelo gemini

       /*
        String[][] xadrex = new String[8][8];



        for (int i = 0; i < xadrex.length; i++) {
            for (int j = 0; j < xadrex[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    xadrex[i][j] = "Preto";
                } else {
                    xadrex[i][j] = "Branco";
                }
            }
        }

        for (int i = 0; i < xadrex.length; i++) {
            for (int j = 0; j < xadrex[i].length; j++) {
                // Imprime o valor da posição atual seguido de um espaço (sem quebrar linha)
                System.out.print(xadrex[i][j] + " ");
            }
            // Sempre que terminar de rodar todas as colunas de uma linha, quebra a linha no console
            System.out.println();
        }

    }
    */

}
