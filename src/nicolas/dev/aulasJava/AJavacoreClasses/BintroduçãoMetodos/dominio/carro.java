package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio;

public class carro {
    public String modelo;
    public String cor;
    public int placa;
    public String documento;
    private int conta;
    private String dadosMotorista;

    public int getConta(){
        return this.conta;
    }

    public void setConta(int conta){
        this.conta = conta;
    }

    public String getDadosMotorista(){
        return this.dadosMotorista;
    }

    public void setDadosMotorista(String dadosMotorista){
        this.dadosMotorista = dadosMotorista;
    }
}
