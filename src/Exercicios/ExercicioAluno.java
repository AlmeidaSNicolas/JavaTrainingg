package Exercicios;
/*
Exercício 1: Ficha de Inscrição de Aluno
Variáveis necessárias: Crie variáveis para armazenar o nome do aluno (texto),
 a idade (número inteiro), o nome do curso (texto) e o valor da mensalidade (número com casas decimais).
Mensagem a ser impressa: "Eu, <nome do aluno>, tenho <idade> anos e confirmo minha inscrição no curso de
<nome do curso> com a mensalidade no valor de <valor da mensalidade>."
 */

public class ExercicioAluno {
    public static void main(String[] args) {

        String nomeAluno = "Ana Julia";
        int idade = 20;
        String nomeDoCurso = "Biomedica Estetica";
        double mensalidade = 400.00;


        System.out.println("Eu " + nomeAluno + " tenho " + idade + " anos e confirmo minha inscrição no curso de " + nomeDoCurso + " com a mensalidade no valor de " +mensalidade+ "Rs");
    }
}
