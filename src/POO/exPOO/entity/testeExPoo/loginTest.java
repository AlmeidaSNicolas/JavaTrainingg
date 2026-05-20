package POO.exPOO.entity.testeExPoo;

import POO.exPOO.entity.login;

public class loginTest {
    public static void main(String[] args) {

        login Login = new login("Nicolas10", "Nicolas11");

        // Testando as 3 tentativas incorretas para forçar o bloqueio
        Login.autenticar("Nicolas10", "Nicol11"); // Tentativa 1
        Login.autenticar("Nicolas10", "Nicol11"); // Tentativa 2
        Login.autenticar("Nicolas10", "Nicol11"); // Tentativa 3 (Bloqueia aqui)

        // Tentando logar de novo depois de bloqueado
        Login.autenticar("Nicolas10", "Nicol11");
    }
}