package nicolas.dev.aulasJava.AJavacoreClasses.GexerciciosVoo;

public class passaporte {
    private String nome;
    private int dataNascimento;
    private String numeroPassaporte;

    {
        System.out.println("Bem vindos ao aeroporto, defina seu usuario e realize as etapas de validação para prosseguir");
        System.out.println();
    }



    public passaporte(String nome, int dataNascimento, String numeroPassaporte) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroPassaporte = numeroPassaporte;
    }

    public passaporte(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }


    public boolean verificarValidade(){
       String nome = this.nome;
       String numeroPassaporte = this.numeroPassaporte;
       int dataNascimento = this.dataNascimento;

       if(this.nome == null || this.numeroPassaporte == null || this.dataNascimento <= 0){
           System.out.println("Dados invalidos, impossivel verificar validade");
           return false;
       }
        System.out.println("Dados validados, passaporte em dia!");
        System.out.println("Nome : " + this.nome);
        System.out.println("Data de Nascimento : " + this.dataNascimento);
        System.out.println("Numero Passaporte : " + this.numeroPassaporte);
        return true;
    }
}
