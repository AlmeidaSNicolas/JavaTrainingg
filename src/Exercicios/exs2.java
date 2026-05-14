package Exercicios;

public class exs2 {
    public static void main(String[] args) {

        boolean possuiChaveFisica = true;
        boolean digitouSenhaCorreta = true;
        boolean ehAdmin = false;
        boolean sistemaEmManutencao = true;

        if (!sistemaEmManutencao && (!ehAdmin || (!possuiChaveFisica && !digitouSenhaCorreta))) {
            System.out.println("Acesso Permitido!");
        } else {
            System.out.println("Acesso Negado!");
        }

    }
}
