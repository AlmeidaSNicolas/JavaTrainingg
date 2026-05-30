package nicolas.dev.aulasJava.AJavacoreClasses.dominio;

public class people {
    private String nome;
    private int idade;
    public char sexo;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo : " + this.sexo);
    }

}

