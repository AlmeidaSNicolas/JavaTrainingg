package nicolas.dev.aulasJava.AJavacoreClasses.Lenums.dominio;

public enum MetodoPagamento {
    DEBITO(1),
    CREDITO(2);

    private int METODO;

    MetodoPagamento(int VALOR) {
        this.METODO = VALOR;
    }


    public int getMetodo() {
        return METODO;
    }
}
