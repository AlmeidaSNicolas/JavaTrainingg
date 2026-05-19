package nicolas.dev.aulasJava;

import java.math.BigDecimal;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int ageDeveloper = 21;

        double salarioDev = 2500.0;
        float salario2Dev = 2500.0f;

        String developerName = "Nicolas";


        System.out.println("O nosso desenvolvedor backend se chama " + developerName +" e ele tem " + ageDeveloper + " anos");

        for (int i = 0; i < 50; i += 10){
            System.out.println("indice " + i);
        }

        String[] frameworks = {"React", "Next.js", "Spring Boot"};

        for (String framework : frameworks) {
            System.out.println("Tecnologia: " + framework);
        }

        int[][] meses = new int[12][30];

        meses[0][0] = 1;
        meses[0][1] = 2;
        meses[0][2] = 3;
        meses[0][3] = 4;
        meses[0][4] = 5;
        meses[0][5] = 6;
        meses[0][6] = 7;
        meses[0][7] = 8;
        meses[0][8] = 9;
        meses[0][9] = 10;
        meses[0][10] = 11;
        meses[0][11] = 12;
        meses[0][12] = 13;
        meses[0][13] = 14;
        meses[0][14] = 15;
        meses[0][15] = 16;
        meses[0][16] = 17;
        meses[0][17] = 18;
        meses[0][18] = 19;
        meses[0][19] = 20;
        meses[0][20] = 21;
        meses[0][21] = 22;
        meses[0][22] = 23;
        meses[0][23] = 24;
        meses[0][24] = 25;
        meses[0][25] = 26;
        meses[0][26] = 27;
        meses[0][27] = 28;
        meses[0][28] = 29;
        meses[0][29] = 30;

        // Loop externo: passa por cada um dos 12 meses
        for (int mes = 0; mes < 12; mes++) {
            System.out.print("Mês " + (mes + 1) + ": ");

            // Loop interno: passa pelos 30 dias daquele mês específico
            for (int dia = 0; dia < 30; dia++) {
                System.out.print(meses[mes][dia] + " ");
            }

            // Quando termina de imprimir os 30 dias, pula para a próxima linha
            System.out.println();
        }


    }
}
