package POO.exPOO.entity.testeExPoo;

import POO.exPOO.entity.conta;

public class teste {
    public static void main(String[] args) {
        conta c1 = new conta("Nicolas", 12000);

        c1.depositar(100);
        c1.exibirExtrato();
        c1.sacar(100);
        c1.exibirExtrato();
    }
}
