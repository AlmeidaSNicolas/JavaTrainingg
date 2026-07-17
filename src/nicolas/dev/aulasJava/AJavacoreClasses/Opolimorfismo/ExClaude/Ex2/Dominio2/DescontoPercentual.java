package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Ex2.Dominio2;

public class DescontoPercentual implements Desconto{

    public double porcentagemDeDesconto ;

    public DescontoPercentual(double porcentagemDeDesconto) {
        this.porcentagemDeDesconto = porcentagemDeDesconto;
    }

    @Override
    public void aplicarDesconto(double ValorOriginal) {
        double valorAposDescontoPercentual = ValorOriginal - this.porcentagemDeDesconto;
        System.out.println("Desconto aplicado com sucesso!, voce vai pagar somente : " + valorAposDescontoPercentual );
    }
}
