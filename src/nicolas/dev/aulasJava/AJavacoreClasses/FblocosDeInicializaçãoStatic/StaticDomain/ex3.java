package nicolas.dev.aulasJava.AJavacoreClasses.FblocosDeInicializaçãoStatic.StaticDomain;

public class ex3 {
    public static int personagens = 0;
    public String nome;

    static{
        System.out.println("Motor de jogo carregado, pronto para criar entidades");
        System.out.println();
    }

    {
        personagens++;
        System.out.println("Alocando recursos para criação de novo personagem");
        System.out.println();
    }

    public ex3(String nome){
        this.nome = nome;
        System.out.println("Personagem " + nome + " criado com sucesso ");
    }

}
