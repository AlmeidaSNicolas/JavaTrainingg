package nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO;

/*
Sua Tarefa:
Crie uma classe chamada Paciente.
Crie os atributos: nome (String), idade (int) e peso (double).
Crie um método chamado imprimirDados que não retorna nada (void).
Dentro do método, use a referência this para imprimir o nome, idade e peso do paciente (ex: this.nome).
Crie uma classe HospitalTeste com o método main, instancie (crie) um paciente, preencha os dados e chame o método imprimirDados().
 */


public class Paciente {
    public String nome;
    public int idade;
    public double peso;

    public void imprimirDados(){
        System.out.println("Seu nome é : " + this.nome);
        System.out.println("Seu peso atual é : " + this.peso);
        System.out.println("Sua idade é : " + this.idade);
    }
}
