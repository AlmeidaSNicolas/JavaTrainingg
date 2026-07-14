package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.ExClaude.Dominio;

public class NotificacaoSMS implements Notificavel{

    String numeroTelefone;

    public NotificacaoSMS(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean validarDestino() {
        if(numeroTelefone.length() == 11 ){
            System.out.println("Validação ocorreu perfeitamente");
            return true;
        }else if(numeroTelefone.length() > 11){
            System.out.println("Validação incorreta numero de telefone invalido");
        }else{
            System.out.println("ERROR: Numero de telefone invalido");
        }
        return false;
    }

    @Override
    public void enviar()
    {
        if(validarDestino()){
            System.out.println("Enviando SMS");
        }else{
            System.out.println("Validação incorreta, cancelando SMS...");
            System.out.println("SMS cancelado");
        }
    }
}
