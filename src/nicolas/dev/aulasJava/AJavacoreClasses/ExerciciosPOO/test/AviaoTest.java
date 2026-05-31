package nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO.test;

import nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO.Aviao;
import nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO.GerenciadorDeVoos;

public class AviaoTest {

    public static void main(String[] args) {
        // Instanciando o gerenciador que você criou
        GerenciadorDeVoos gerenciador = new GerenciadorDeVoos();

        // 1. Criando os objetos Aviao
        Aviao aviao1 = new Aviao(1, "G3-1500", "São Paulo", "Agendado");
        Aviao aviao2 = new Aviao(2, "LA-8080", "Madri", "Em voo");
        Aviao aviao3 = new Aviao(3, "AD-4321", "Lisboa", "Agendado");

        // 2. Testando o Create (Adicionar)
        System.out.println("--- ADICIONANDO VOOS ---");
        gerenciador.adicionarVoo(aviao1);
        gerenciador.adicionarVoo(aviao2);
        gerenciador.adicionarVoo(aviao3);

        // 3. Testando o Read (Listar)
        System.out.println("\n--- LISTA INICIAL ---");
        gerenciador.listarVoos();

        // 4. Testando o Update (Atualizar Status)
        System.out.println("\n--- ATUALIZANDO STATUS DO VOO 1 ---");
        gerenciador.atualizarStatus(1, "Cancelado");

        // 5. Testando o Delete (Remover)
        System.out.println("\n--- REMOVENDO VOO 2 ---");
        gerenciador.removerVoo(2);
        System.out.println("Voo 2 removido da memória.");

        // 6. Testando o Read novamente para validar as alterações
        System.out.println("\n--- LISTA FINAL APÓS ALTERAÇÕES ---");
        gerenciador.listarVoos();
    }
}