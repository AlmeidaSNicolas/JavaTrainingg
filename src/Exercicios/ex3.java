package Exercicios;
/*
1. O Recibo de Compra 🛒
Imagine que você está desenvolvendo um sistema simples para uma loja.

Objetivo: Crie variáveis para o nome de um produto (ex: "Teclado Gamer"), o preço unitário
dele e a quantidade comprada pelo cliente.

Saída esperada: Exiba uma mensagem formatada em uma única linha como: Item: [NOME] | Total: R$ [VALOR_TOTAL].
O valor total deve ser calculado (preço * quantidade) e exibido com exatamente 2 casas decimais.
 */

public class ex3 {
    public static void main(String[] args) {

        String nomeProduto = "Suco tang";
        double precoUnitario = 2.99;
        double quantidadeComprada = 3;

        double valorTotal = precoUnitario * quantidadeComprada;

        System.out.printf("Item %s | Total: Rs %.2f ", nomeProduto, valorTotal);

    }






}
