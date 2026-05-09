package Exercicios;

/*
. Painel de RPG 🛡️
Objetivo: Defina o nome de um personagem, seu nível (número inteiro) e sua barra de vida atual (um valor decimal entre 0 e 100).

Saída esperada: Use o printf para mostrar os status assim: [NOME] - Nv. [NÍVEL] | HP: [VIDA]%.
Certifique-se de que o nível apareça como um número inteiro e a vida tenha 0 casas decimais (apenas o número arredondado).
 */

public class Ex4 {
    public static void main(String[] args) {

        String nome = "Ruberval";
        int nivel = 100;
        int vidaAtual = 50;

        System.out.printf("%s - Nv. %d | HP: %d", nome, nivel, vidaAtual);

    }
}
