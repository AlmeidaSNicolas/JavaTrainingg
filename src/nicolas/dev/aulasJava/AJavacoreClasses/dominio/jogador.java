package nicolas.dev.aulasJava.AJavacoreClasses.dominio;

public class jogador {
    private String nome;
    public int idade;

    public jogador(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade negativa nao permitida");
            return 0;
        }
        return this.idade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
