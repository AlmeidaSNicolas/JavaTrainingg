package nicolas.dev.aulasJava.AJavacoreClasses.Polimorfismo.ExClaude.Dominio;

public class NotficacaoEmail implements Notificavel{

    String email;

    public NotficacaoEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean validarDestino() {
        if(email.contains("@")){
            System.out.println("Enviando seu email...");
            return true;
        }else{
            System.out.println("Email invalido");
        }
        return false;
    }

    @Override
    public void enviar() {
        if(validarDestino()){
            System.out.println("Email enviado");
        }else{
            System.out.println("Validação cancelada, cancelando EMAIL");
        }
    }
}
