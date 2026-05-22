package nicolas.dev.aulasJava.AJavacoreClasses.dominio;

public class personagem {
    String nome;
    int aura;
    int forcaAtaque;

    public personagem(String nome, int aura, int forcaAtaque) {
        this.nome = nome;
        this.aura = aura;
        this.forcaAtaque = forcaAtaque;
    }

    public void treinar(){
        if(aura < 10){
            System.out.println("Nao é possivel treinar, voce esta cansado");
        }else {
            aura = aura - 10;

            forcaAtaque = forcaAtaque + 5;

            System.out.println("Treino concluido com sucesso!!");
        }
    }


}
