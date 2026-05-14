package Exercicios;

public class exContinueJava {
    public static void main(String[] args) {
        double[] transacoes = {150.50, -20.0, 5000.0, 0.0,  200.0, 10.0};
        double receitaTotal = 0;
        boolean loteSuspeito = false;

        for (double valor : transacoes) {
            // 1. Verifique se é uma fraude (> 1.000.000)
            if(valor >= 1000000){
                loteSuspeito = true;
                System.out.println("Operação fraudulenta");
                break;

            }
            // 2. Verifique se é estorno ou grátis (<= 0)
            if(valor <= 0){
                continue;
            }

            // 3. Se passar pelas regras, some à receitaTotal
            receitaTotal += valor;
        }

        // Exiba o resultado final e o status do lote (Se foi interrompido ou não)
        if(!loteSuspeito){
            System.out.printf("Se voce chegou aqui! Seu lote passou com segurança seu saldo é %.2f", receitaTotal);
        }
    }
}