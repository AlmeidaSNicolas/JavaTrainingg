package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CacularTaxa() {
        System.out.println("Calculando imposto do Tomate...");
        System.out.println("Imposto calculado com sucesso!");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
