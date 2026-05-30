package nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO;

public class funcionarios {
    private String nome;
    private int idade;
    private double[] salario2;


    public void imprimirDados(){
        System.out.println("Nome : " + this.nome);
        System.out.println("idade : " + this.idade);
        for (double salaro: salario2) {
            System.out.println(salaro + "  ");
        }
    }

    public void media(){
        double media = 0;
        for(double salario: salario2){
            media += salario;
        }
        media = media/salario2.length;
        System.out.println(" \n Media final: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario2() {
        return salario2;
    }

    public void setSalario2(double[] salario2) {
        this.salario2 = salario2;
    }
}