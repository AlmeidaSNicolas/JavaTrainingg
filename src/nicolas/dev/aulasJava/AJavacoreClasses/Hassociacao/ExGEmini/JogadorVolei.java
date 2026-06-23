package nicolas.dev.aulasJava.AJavacoreClasses.Hassociacao.ExGEmini;

public class JogadorVolei {
    private String nome;
    private String posicao; //ponta, meia, levantador, libero

    public JogadorVolei(String nome,String posicao){
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void imprimirDados(){
        System.out.println("-------------------");
        System.out.println("Dados do atela selecionado abaixo ");
        System.out.println("Nome do atleta : " + this.nome);
        System.out.println("Posição do atleta : " + this.posicao);
    }

}

