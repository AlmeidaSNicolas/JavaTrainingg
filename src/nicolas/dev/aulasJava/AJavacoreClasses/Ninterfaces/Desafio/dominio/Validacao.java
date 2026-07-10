package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.dominio;

public class Validacao {

    public static void verificacaoSimples(Pagamento pagamento){
        if(pagamento.validarDados()){
            pagamento.exibirRecibo();
        }else {
            System.out.println("ERROR: Quantidade de parcelas invalidas");
        }
    }
}
