package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.exception.Dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
