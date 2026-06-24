package nicolas.dev.aulasJava.AJavacoreClasses.Iherença;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salario: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
