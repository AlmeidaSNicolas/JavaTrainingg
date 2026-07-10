package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.dominio;

public class PagamentoCredito extends Pagamento implements  Validavel{
    int parcelas;

    public PagamentoCredito(double valorOriginal, TipoPagamento tipoPagamento, int parcelas) {
        super(valorOriginal, tipoPagamento);
        this.parcelas = parcelas;
    }

    @Override
    public double calcularValorFinal(){
        if(parcelas > 3){
            System.out.println("Parcela maior que 3, adicionando 5% de juros");
            double juros = valorOriginal * 0.05;
            return valorOriginal + juros;
        }else {
            System.out.println("Valor sem mudança");
            return valorOriginal;
        }
    }

    @Override
    public boolean validarDados(){
        return parcelas >1 && parcelas <=12;
    }


}
