package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.GUILDA;

public class Guilda {
    private String nome;
    private Aventureiro[] membros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aventureiro[] getMembros() {
        return membros;
    }

    public void setMembros(Aventureiro[] membros) {
        this.membros = membros;
    }

    public Guilda(String nome, int capacidadeMaxima){
        this.nome = nome;
        this.membros = new Aventureiro[capacidadeMaxima];
    }

    public void recrutar(Aventureiro aventureiro){
        if(aventureiro == null){
            return;
        }
        for(int i = 0; i < membros.length; i++){
            if(this.membros[i] == null){
                this.membros[i] = aventureiro;
                aventureiro.setGuilda(this);
                System.out.println("Membro " + i + ": " + aventureiro.getNome());
                break;
            }
        }
    }

    public void expulsar(String nome){
        for(int i = 0; i < membros.length; i++) {
            if(membros[i] != null && membros[i].getNome().equals(nome)){
                membros[i].setGuilda(null);
                membros[i] = null;
                System.out.println("Aventureiro expulso!");
                break;
            }
        }
    }
}
