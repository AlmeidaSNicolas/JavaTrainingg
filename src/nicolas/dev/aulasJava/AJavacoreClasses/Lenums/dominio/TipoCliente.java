package nicolas.dev.aulasJava.AJavacoreClasses.Lenums.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }
}
