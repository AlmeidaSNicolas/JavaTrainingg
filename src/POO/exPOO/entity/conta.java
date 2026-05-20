package POO.exPOO.entity;

public class conta {
    public String nome;
    public double saldo;

    public conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if(saldo > 0 && valor > 0){
            this.saldo -= valor;
        }
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void exibirExtrato(){
        System.out.println( nome  + " : " + saldo );
    }
}
