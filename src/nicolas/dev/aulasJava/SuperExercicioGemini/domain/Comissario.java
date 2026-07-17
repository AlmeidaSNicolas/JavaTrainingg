package nicolas.dev.aulasJava.SuperExercicioGemini.domain;


public class Comissario extends Funcionario {
    private String[] idiomasFluentes;

    public Comissario(String nome, String matricula, double salarioBase, String[] idiomasFluentes) {
        super(nome, matricula, salarioBase);
        this.idiomasFluentes = idiomasFluentes;
    }

    @Override
    double calcularSalarioFinal() {

        return this.salarioBase + (this.idiomasFluentes.length * 300);
    }
}