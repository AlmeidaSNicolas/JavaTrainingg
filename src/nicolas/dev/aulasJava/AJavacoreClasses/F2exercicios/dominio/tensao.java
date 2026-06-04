package nicolas.dev.aulasJava.AJavacoreClasses.F2exercicios.dominio;

public class tensao {
    private String regiao;
    private String paisesEnvolvidos;
    private String statusAtual;
    private boolean monitoramentoAtivo;

    public tensao(String regiao, String paisesEnvolvidos) {
        this.regiao = regiao;
        this.paisesEnvolvidos = paisesEnvolvidos;
        this.statusAtual = "Observação";
        this.monitoramentoAtivo = true;
    }

    public tensao(String regiao, String paisesEnvolvidos, String statusAtual, boolean monitoramentoAtivo){
        this(regiao, paisesEnvolvidos);
        this.statusAtual = statusAtual;
        this.monitoramentoAtivo = true;
    }

    public void ImprimirStatus(){
        System.out.println("Dados abaixo: ");
        System.out.println(this.regiao);
        System.out.println(this.paisesEnvolvidos);
        System.out.println(this.statusAtual);
        System.out.println(this.monitoramentoAtivo);
    }


}
