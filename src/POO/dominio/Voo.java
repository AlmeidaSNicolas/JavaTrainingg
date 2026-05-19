package POO.dominio;

import java.sql.SQLOutput;

public class Voo {
    public int numeroVoo;
    public String destino;
    public int capacidadeMaxima;
    public int passageirosABordo;
    public int vagasDisponiveis;

    public Voo(int numeroVoo, String destino, int capacidadeMaxima, int passageirosABordo, int vagasDisponiveis) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.capacidadeMaxima = capacidadeMaxima;
        this.passageirosABordo = passageirosABordo;
        this.vagasDisponiveis = vagasDisponiveis;
    }


    public void fazerChekin(String nomePassageiro) {
        if (this.passageirosABordo < this.capacidadeMaxima) {
            this.passageirosABordo++;
            System.out.println("Chekin realizado " + nomePassageiro + " Aproveite a viagem ");
            System.out.println("Assentos ocupados : " + this.passageirosABordo + "/" + this.capacidadeMaxima);
        } else {
            System.out.println("Voo lotado" + this.numeroVoo + " Voo lotado");
        }
    }


}

