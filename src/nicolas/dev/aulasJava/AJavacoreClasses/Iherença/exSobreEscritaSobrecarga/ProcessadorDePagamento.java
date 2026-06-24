package nicolas.dev.aulasJava.AJavacoreClasses.Iherença.exSobreEscritaSobrecarga;

public class ProcessadorDePagamento {

    public void processar(double valor){
        System.out.println("Processando pagamento em dinhero com valor :" + valor);
    }

    public void processar(double valor, String numeroCartao){
        System.out.println("Processando pagamento com cartao, numeros finais" + numeroCartao.substring(numeroCartao.length() - 4));
    }

    public void processar(double valor, String numeroCartao, boolean chaveAleatoria){
        chaveAleatoria = chaveAleatoria;

        if(chaveAleatoria ){
            System.out.println("Mensagem super especifica");
        }else{
            System.out.println("Valor :" + valor + " Chave : " + chaveAleatoria);
        }
    }



}
