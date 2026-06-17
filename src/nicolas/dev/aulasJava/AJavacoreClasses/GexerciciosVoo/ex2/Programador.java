package nicolas.dev.aulasJava.AJavacoreClasses.GexerciciosVoo.ex2;

public class Programador {
    private String nome;
    private String matricula;

    public Programador(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Programador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
