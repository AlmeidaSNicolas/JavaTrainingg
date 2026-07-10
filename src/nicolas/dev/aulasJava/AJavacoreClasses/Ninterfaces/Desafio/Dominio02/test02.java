package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.Dominio02;

public class test02 {
    public static void main(String[] args) {

        Moto m1 = new Moto("ADE-123", 100, CategoriaHabilitacao.A, 5000);
        Caminhao c1 = new Caminhao("AGT-654", 1000, CategoriaHabilitacao.D, 3);


        Validacao.processarAluguel(m1, 10);
        System.out.println();
        Validacao.processarAluguel(c1, 30);
    }
}
