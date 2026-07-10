package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.test;

import nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.dominio.*;

public class Test01 {
    public static void main(String[] args) {

        Pagamento pagamento1 = new PagamentoPix(100, TipoPagamento.PIX);
        Pagamento pagamento2 = new PagamentoCredito(200, TipoPagamento.CREDITO, 4);
        Pagamento pagamento3 = new PagamentoPix(10000, TipoPagamento.BOLETO);

        Validacao.verificacaoSimples(pagamento1);
        Validacao.verificacaoSimples(pagamento2);
        Validacao.verificacaoSimples(pagamento3);
    }
}
