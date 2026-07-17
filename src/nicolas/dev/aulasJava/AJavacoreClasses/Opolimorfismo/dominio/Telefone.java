package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.dominio;

public class Telefone extends Produto {

    public static final double IMPOSTO = 0.10;
    public Telefone(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CacularTaxa() {
        System.out.println("Calculando Imposto do telefone");
        System.out.println("Imposto calculado com sucesso");
        return this.valor * IMPOSTO;
    }
}
