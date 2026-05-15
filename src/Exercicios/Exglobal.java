package Exercicios;

public class Exglobal {
    public static void main(String[] args) {
        int opcao = 3;

        double saldo = 20000;

        switch (opcao) {
            case 1 -> System.out.println("Seu saldo é " + saldo);
            case 2 -> System.out.println("Extrato");
            case 3 -> System.out.printf("Transferencia de %.2f %n", saldo);
            default -> System.out.println("Opção Invalida");
        }

        String status = saldo > 0 ? "Positive" : "Negative";

        System.out.println("Seu status é " + status);
    }


}
