package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.runtime.test;

public class EstatisticaInvalidaException extends RuntimeException{

    public EstatisticaInvalidaException(String message){
        super(message);
    }

    public EstatisticaInvalidaException(String message, Throwable cause){
        super(message,cause);
    }

}
