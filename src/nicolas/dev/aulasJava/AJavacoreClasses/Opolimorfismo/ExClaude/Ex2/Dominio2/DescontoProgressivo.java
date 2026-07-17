package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Ex2.Dominio2;

public class DescontoProgressivo implements Desconto {
    public double valorMinimoDeCompra;

    public DescontoProgressivo(double valorMinimoDeCompra) {
        this.valorMinimoDeCompra = valorMinimoDeCompra;
    }

    @Override
    public void aplicarDesconto(double ValorOriginal){
        double percentualDesconto = 20.0;
        double valorDesconto = (ValorOriginal * percentualDesconto) / 100;
        double precoFinal = ValorOriginal - valorDesconto;



        if(ValorOriginal >= this.valorMinimoDeCompra){
            System.out.println("Aplicando 20% de desconto");
            System.out.println("Voce vai pagar, apos o desconto o valor de : " + precoFinal);
        }else{
            double percentualCinco = 5.0;
            double valorDescontoCinco = (ValorOriginal * percentualCinco) / 100;
            double precoCincoFinal = ValorOriginal - valorDescontoCinco;
            System.out.println("5% de desconto aplicado : " + precoCincoFinal + " Voce ainda deve nos pagar esse valor");
        }
    }
}
