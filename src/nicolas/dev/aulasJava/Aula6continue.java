package nicolas.dev.aulasJava;

public class Aula6continue {
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " RS : " + valorParcela);
        }

        double parcelaAgua = 1000;

        for (int pAgua = (int) parcelaAgua; pAgua >= 1; pAgua--) {
            double valorParcela = valorTotal / parcelaAgua;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.printf("Sua parcela é RS: %.2f\n", valorParcela);
        }

        for (int i = 1; i <= 20; i++) {
            // Implemente o check de múltiplo de 3 aqui
            // Use o continue
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("Número: " + i);
        }

        int[] produtos = {101, -1, 102, 103, -5, 104, -20, 105};

        for (int id : produtos) {
            // Use continue para IDs negativos

            if (id < 0) {
                continue;
            }
            System.out.println("Processando produto ID: " + id);
        }

        double[] lancamentos = {150.0, -20.0, 300.0, -50.0, 100.0, -10.0};
        double totalEntradas = 0;

        for (double valor : lancamentos) {
            // Se for negativo, continue
            if (valor < 0) {
                continue;
            }
            ;
            totalEntradas += valor;
        }

        System.out.println("Total apenas de entradas: R$ " + totalEntradas);

        int soma = 0;
        for (int i = 0; i <=50; i++){

            if (i % 2 == 0){
                continue;
            }
            soma += i;

            System.out.println("Soma dos impares " + soma);
        }

        double[] notas = {8.5, 5.0, 7.2, 4.5, 9.0, 6.8, 10.0};

        System.out.println("Notas acima da média:");
        for (double nota : notas) {
            if(nota < 7) {
                continue;
            }
            System.out.println("Nota: " + nota);
        }

        int pessoa = 1;
        while (pessoa <= 10) {
            if (pessoa == 5 ) {
                // Como pular o 5 sem travar o contador?
                // Dica: incremente a variável aqui antes do continue
                pessoa = pessoa + 1;
                continue;
            }
            System.out.println("Atendendo pessoa nº: " + pessoa);
            pessoa++;
        }


    }
}

