package nicolas.dev.aulasJava.AJavacoreClasses.ExerciciosPOO;

/*
Cenário: O hospital agora precisa cadastrar os Médicos, mas os dados não podem ser alterados de qualquer jeito.
Sua Tarefa:
Crie uma classe Medico.
Crie os atributos nome, especialidade e salario2, mas todos devem ter o modificador de acesso private.
Crie os métodos Getters e Setters para todos os atributos.
Crie um Construtor que obrigue quem for instanciar o Médico a passar o nome e a especialidade.
Crie a Sobrecarga do Construtor: crie um segundo construtor que receba nome, especialidade e também o salario2.
 */
public class Medicos {
    private String nome;
    private String especialidade;
    private int salario;

    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public int getSalario(){
        return this.salario;
    }

    public Medicos(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Medicos(String nome, String especialidade, int salario){
        this(nome, especialidade);
        this.salario = salario;
    }
}
