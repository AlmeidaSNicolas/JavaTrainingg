package nicolas.dev.aulasJava.AJavacoreClasses.Lenums.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    private MetodoPagamento metodoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, MetodoPagamento metodoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.metodoPagamento = metodoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.getVALOR() +
                ", tipoMetodoPagamento=" + metodoPagamento.getMetodo() +
                '}';
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
