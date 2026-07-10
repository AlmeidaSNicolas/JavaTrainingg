package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.dominio;

public class PagamentoPix extends Pagamento implements  Validavel{
    public PagamentoPix(double valorOriginal, TipoPagamento tipoPagamento) {
        super(valorOriginal, tipoPagamento);
    }

    @Override
    public boolean validarDados(){
        return valorOriginal > 0;
    }


    @Override
    public double calcularValorFinal() {
        double desconto = valorOriginal * 0.9;
        return desconto;
    }


}
