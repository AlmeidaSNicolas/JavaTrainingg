package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Ex2.Dominio2;

public class DescontoFixo implements Desconto{

    public double valorFixoAserSubtraido;

    public DescontoFixo(int valorFixoAserSubtraido) {
        this.valorFixoAserSubtraido = valorFixoAserSubtraido;
    }

    @Override
    public void aplicarDesconto(double ValorOriginal) {
        double precoFinal;
       if(ValorOriginal < this.valorFixoAserSubtraido){
           precoFinal = 0;
           System.out.println("Desconto aplicado com sucesso, voce vai pagar : " + precoFinal );
       }else if(ValorOriginal > this.valorFixoAserSubtraido){
           double precoAposDesconto = ValorOriginal - valorFixoAserSubtraido;
           System.out.println("Voce ate recebeu nosso desconto fixo de : " + valorFixoAserSubtraido + " Porem seu produto esta acima do desconto, no caso voce ainda vai ter que pagar : " + precoAposDesconto);
       }
    }
}
