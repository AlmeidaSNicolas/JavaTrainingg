package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.GUILDA;

public class MainTest {
    public static void main(String[] args) {
        // 1. Instanciando a Guilda com espaço para 3 membros
        Guilda fairyTail = new Guilda("Fairy Tail", 3);

        // 2. Instanciando os Aventureiros
        // Natsu tem espaço para 2 missões. Lucy tem espaço para 1.
        Aventureiro natsu = new Aventureiro("Natsu", 10, 2);
        Aventureiro lucy = new Aventureiro("Lucy", 5, 1);

        // 3. Instanciando as Missões
        Missao missao1 = new Missao("Derrotar os goblins", "C");
        Missao missao2 = new Missao("Coletar ervas místicas", "D");
        Missao missao3 = new Missao("Enfrentar o Dragão", "S");

        // 4. Pegando as missões (Teste de inserção Unidirecional)
        System.out.println("--- NATSU NO QUADRO DE MISSÕES ---");
        natsu.pegarMissao(missao1); // Aceita
        natsu.pegarMissao(missao2); // Aceita
        natsu.pegarMissao(missao3); // O laço não vai achar vaga e não fará nada (o ideal no futuro é colocar um aviso de "limite atingido")

        // 5. Verificando o status antes de ter guilda
        System.out.println("\n--- FICHA DO NATSU (ANTES DO RECRUTAMENTO) ---");
        natsu.imprimirFicha(); // Deve imprimir "Lobo solitario"

        // 6. Teste de Associação Bidirecional
        System.out.println("\n--- INICIANDO RECRUTAMENTO ---");
        fairyTail.recrutar(natsu);
        fairyTail.recrutar(lucy);

        // 7. A Mágica do Bidirecional
        System.out.println("\n--- FICHA DO NATSU (DEPOIS DO RECRUTAMENTO) ---");
        // Reparou? Você executou o método na Guilda, mas a ficha do Aventureiro atualizou sozinha!
        natsu.imprimirFicha();

        // 8. O Teste de Exclusão e Gerenciamento de Memória
        System.out.println("\n--- A GRANDE EXPULSÃO ---");
        fairyTail.expulsar("Natsu");

        // 9. Listando os Membros da Guilda para provar que o "buraco" foi gerenciado
        System.out.println("\n--- MEMBROS ATUAIS DA FAIRY TAIL ---");
        Aventureiro[] membrosDaGuilda = fairyTail.getMembros();
        for (int i = 0; i < membrosDaGuilda.length; i++) {
            if (membrosDaGuilda[i] != null) {
                System.out.println("- " + membrosDaGuilda[i].getNome());
            }
        }

        // 10. A Queda do Herói
        System.out.println("\n--- FICHA DO NATSU (APÓS EXPULSÃO) ---");
        natsu.imprimirFicha(); // Deve ter voltado automaticamente para "Lobo solitario"
    }
}
