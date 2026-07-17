package nicolas.dev.aulasJava.SuperExercicioGemini.domain;

public class Piloto extends Funcionario implements AutorizacaoVoo {
    private int horasDeVoo;

    public Piloto(String nome, String matricula, double salarioBase, int horasDeVoo) {
        super(nome, matricula, salarioBase);
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    double calcularSalarioFinal() {
        return this.salarioBase + (this.horasDeVoo * 50);
    }

    @Override
    public boolean checarProntidao() {
        if(horasDeVoo > 100){
            System.out.println("Piloto " + this.nome + " está apto a partir.");
            return true;
        }
        System.out.println("O piloto " + this.nome + " não tem horas suficientes.");
        return false;
    }
}