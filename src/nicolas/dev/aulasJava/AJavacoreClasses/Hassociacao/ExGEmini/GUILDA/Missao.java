package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini.GUILDA;

public class Missao {
    private String titulo;
    private String rank; // S, A , B
    private boolean concluida;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public Missao(String titulo, String rank){
        this.titulo = titulo;
        this.rank = rank;
        this.concluida = false;
    }

    public void finalizar(){
        concluida = true;
    }


}
