package nicolas.dev.aulasJava.AJavacoreClasses.Opolimorfismo.ExClaude.Dominio;

public class NotificacaoPush implements Notificavel {

    String token;

    public NotificacaoPush(String token) {
        this.token = token;
    }

    @Override
    public boolean validarDestino() {
        if (token.length() == 10) {
            System.out.println("Validação OK");
            return true;
        } else if (token.length() < 10 || token.isEmpty()) {
            System.out.println("Validação incorreta, a algo de errado com seu token");
        }
        return false;
    }

   @Override
    public void enviar(){
        if(validarDestino()){
            System.out.println("Enviando Mensagem");
        }else{
            System.out.println("Mensagem nao enviada, validação incorreta");
        }
   }

}