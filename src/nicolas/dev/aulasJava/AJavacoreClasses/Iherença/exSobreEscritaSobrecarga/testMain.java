package nicolas.dev.aulasJava.AJavacoreClasses.Iherença.exSobreEscritaSobrecarga;

public class testMain {
    public static void main(String[] args) {

        ProcessadorDePagamento p1 = new ProcessadorDePagamento();

        p1.processar(20);
        p1.processar(3000, "asdall");
        p1.processar(10239103, "ajsdsadNAA1", true);

    }
}
