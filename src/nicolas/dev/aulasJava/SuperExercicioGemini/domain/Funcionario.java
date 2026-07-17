package nicolas.dev.aulasJava.SuperExercicioGemini.domain;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome() { return nome; }

    abstract double calcularSalarioFinal();
}