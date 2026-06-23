package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini;

import nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.JogadorVolei;

public class Time {
    private String nome;
    private JogadorVolei[] Jogadores = new JogadorVolei[12];

    public Time(String nome, int capacidadeMaxima) {
        this.nome = nome;
        this.Jogadores = new JogadorVolei[capacidadeMaxima];
    }

    public void adicionarJogador(JogadorVolei jogador){
        if(jogador == null){
            System.out.println("Error!! dados insuficientes");
            return;
        }

        boolean adicionado = false;

        for (int i = 0; i < this.Jogadores.length; i++) {
            if(this.Jogadores[i] == null){
                this.Jogadores[i] = jogador;
                System.out.println("Jogador Adicionado");
                adicionado = true;
                break;
            }
        }
        if(adicionado == false){
            System.out.println("Elenco lotado");
            return;
        }
    }

}
