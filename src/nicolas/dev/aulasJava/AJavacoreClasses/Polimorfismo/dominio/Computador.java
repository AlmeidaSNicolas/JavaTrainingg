package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double CacularTaxa() {
        System.out.println("Calculando imposto do Computador...");
        System.out.println("Imposto calculado com sucesso!");
        return this.valor * IMPOSTO;
    }



}



