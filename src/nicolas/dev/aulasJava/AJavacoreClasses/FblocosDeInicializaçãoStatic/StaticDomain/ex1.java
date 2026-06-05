package nicolas.dev.aulasJava.AJavacoreClasses.FblocosDeInicializaçãoStatic.StaticDomain;

public class ex1 {
    public static String status;

    static {
        status = "Sistema inicializado";
        System.out.println("Bloco estático executado: " + status);
    }

    public ex1(){
        System.out.println("Constructor executado");
    }

}
