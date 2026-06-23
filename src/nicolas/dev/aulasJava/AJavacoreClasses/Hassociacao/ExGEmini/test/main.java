package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.JogadorVolei;
import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.Time;

public class main {
    public static void main(String[] args) {

        // 1. Instanciando o Time com capacidade máxima rígida de 3 jogadores
        Time time = new Time("Karasuno", 3);

        // 2. Criando os jogadores isoladamente na memória
        JogadorVolei jogador1 = new JogadorVolei("Nicolas", "Levantador");
        JogadorVolei jogador2 = new JogadorVolei("Killua", "Ponteiro");
        JogadorVolei jogador3 = new JogadorVolei("Gon", "Líbero");

        // 3. Teste de Inserção Normal
        System.out.println("--- Iniciando Contratações ---");
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time.adicionarJogador(jogador3);

        // 4. Teste de Lotação (Estouro de Array)
        System.out.println("\n--- Testando Limite do Elenco ---");
        JogadorVolei jogador4 = new JogadorVolei("Hisoka", "Oposto");
        time.adicionarJogador(jogador4); // Aqui deve imprimir "Elenco lotado"

        // 5. Teste de Segurança (NullPointerException)
        System.out.println("\n--- Testando Inserção Inválida ---");
        time.adicionarJogador(null); // Aqui deve imprimir a mensagem de erro de dados insuficientes

        // 6. Teste Prático de Referência de Memória
        System.out.println("\n--- Alterando Estado na Memória ---");
        // Alteramos o nome diretamente no objeto original, sem usar a classe Time
        jogador1.setNome("Nicolas Almeida (Capitão)");
        System.out.println("Nome alterado na origem com sucesso.");
        jogador1.imprimirDados();
        jogador2.imprimirDados();
        jogador3.imprimirDados();



        /* * Se você implementar um método imprimirEscalacao() no seu Time depois,
         * chame ele aqui embaixo. Você verá que o nome do jogador1 dentro do time
         * também mudou para "Nicolas Almeida (Capitão)", provando que o array
         * guarda apenas o ponteiro de memória, e não um clone do objeto.
         */


    }
}
