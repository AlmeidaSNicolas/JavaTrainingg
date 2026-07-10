package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.dominio;

public abstract class Pagamento implements Validavel{
    double valorOriginal;
    TipoPagamento tipoPagamento;

    public Pagamento(double valorOriginal, TipoPagamento tipoPagamento) {
        this.valorOriginal = valorOriginal;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public boolean validarDados() {
        return false;
    }

    public abstract double calcularValorFinal();

    public void exibirRecibo(){
        System.out.println("--------------");
        System.out.println("Tipo do pagamento : " + tipoPagamento);
        System.out.println("Valor original : " + valorOriginal);
        System.out.println("Valor final : " + calcularValorFinal());
        System.out.println("--------------");
    };
}
