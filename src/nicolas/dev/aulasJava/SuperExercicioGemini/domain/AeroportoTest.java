package nicolas.dev.aulasJava.SuperExercicioGemini.domain;

public class AeroportoTest {
    public static void main(String[] args) {

        // 1. Instanciar 1 Aeronave, 2 Pilotos e 5 Comissários
        Aeronave a1 = new Aeronave("BRA01", "BOING463", 200);

        // Pilotos (recebem: nome, matricula, salarioBase, horasDeVoo)
        Piloto p1 = new Piloto("Sergio", "SG1U", 4000, 150);
        Piloto p2 = new Piloto("Luan", "LA2E3", 3500, 80);

        // Comissários (recebem: nome, matricula, salarioBase, array de idiomas)
        Comissario c1 = new Comissario("Pedro", "C01", 2000, new String[]{"Inglês", "Espanhol"});
        Comissario c2 = new Comissario("João", "C02", 2000, new String[]{"Inglês"});
        Comissario c3 = new Comissario("Luís", "C03", 2000, new String[]{"Inglês", "Francês", "Alemão"});
        Comissario c4 = new Comissario("Nicolas", "C04", 2000, new String[]{"Inglês"});
        Comissario c5 = new Comissario("Maria", "C05", 2000, new String[]{"Inglês", "Italiano"});

        // 2. Criar 2 Voos diferentes
        Voo v1 = new Voo("GOL1111");
        Voo v2 = new Voo("GOL2222");


        System.out.println("Total de voos registrados no sistema: " + Voo.getTotalVoosRegistrados());
        System.out.println("-------------------------------------------------");

        // 4. Associar funcionários ao Voo 1 e forçar a Exceção
        v1.setAeronave(a1);
        v1.setPiloto(p1);

        try {
            System.out.println("Embarcando comissários no Voo " + v1.getCodigo() + "...");
            v1.adicionarComissario(c1);
            v1.adicionarComissario(c2);
            v1.adicionarComissario(c3);
            v1.adicionarComissario(c4);

            System.out.println("Tentando embarcar o 5º comissário (Maria)...");
            v1.adicionarComissario(c5);

        } catch (RuntimeException e) {
            System.out.println("Erro capturado pelo sistema: " + e.getMessage());
        }

        System.out.println("-------------------------------------------------");

        Funcionario[] equipe = {p1, p2, c1, c2, c3, c4, c5};

        System.out.println("--- CÁLCULO DA FOLHA DE PAGAMENTO ---");
        for (Funcionario funcionario : equipe) {
            System.out.println("Colaborador: " + funcionario.getNome() +
                    " | Salário Final: R$ " + funcionario.calcularSalarioFinal());
        }
    }
}