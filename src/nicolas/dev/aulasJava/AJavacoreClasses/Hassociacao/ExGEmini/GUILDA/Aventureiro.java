package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.GUILDA;

public class Aventureiro {
    private String nome;
    private int nivel;
    private Missao[] missoes;
    private Guilda guilda;

    public Aventureiro(String nome, int nivel, int capacidadeDeMissoes){
        this.nome = nome;
        this.nivel = nivel;
        this.missoes = new Missao[capacidadeDeMissoes];
        this.guilda = null;
    }

    public void pegarMissao(Missao missao){
        if(missao == null){
            System.out.println("Missao invalida");
        }
        for(int i = 0; i < missoes.length; i++){
            if(this.missoes[i] == null){
                this.missoes[i] = missao;
                System.out.println("Missao aceita!");
                break;
            }
        }

    }

    public void imprimirFicha(){
        System.out.println("Ficheiro : ");
        System.out.println("Nome : " + this.nome);
        System.out.println("Nivel : " + this.nivel);


        if(this.guilda != null){
            System.out.println("Nome da guilda : " + this.guilda.getNome());
        }else{
            System.out.println("Lobo solitario");
        }

    }

    public Guilda getGuilda() {
        return guilda;
    }

    public void setGuilda(Guilda guilda) {
        this.guilda = guilda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Missao[] getMissoes() {
        return missoes;
    }

    public void setMissoes(Missao[] missoes) {
        this.missoes = missoes;
    }
}
