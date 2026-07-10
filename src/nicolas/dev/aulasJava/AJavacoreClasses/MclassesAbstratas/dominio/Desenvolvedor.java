package nicolas.dev.aulasJava.AJavacoreClasses.MclassesAbstratas.dominio;

public class Desenvolvedor extends Funcionario{
    private String stack;

    public Desenvolvedor(String nome, double salario, String stack) {
        super(nome, salario);
        this.stack = stack;
    }



    @Override
    public void calculaBonus() {
        this.salario = salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", stack='" + stack + '\'' +
                '}';
    }
}
