package nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO;

public class funcionarios {
    public String nome;
    public int idade;
    public double[] salario2;


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

    

}