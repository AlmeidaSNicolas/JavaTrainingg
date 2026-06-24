package nicolas.dev.aulasJava.AJavacoreClasses.Iherença;

public class testMain {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("Rua 1023", "23476533");
        Endereco e2 = new Endereco("Rua 1122", "12321366");

        Pessoa p1 = new Pessoa("Nicolas", "44498076533", e1);

        p1.imprimir();

        Funcionario f1 = new Funcionario("Joao", "44355687311", e2, 12000);

        f1.imprimir();

    }
}
