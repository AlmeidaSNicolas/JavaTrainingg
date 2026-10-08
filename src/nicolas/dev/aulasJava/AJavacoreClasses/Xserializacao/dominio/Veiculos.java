package nicolas.dev.aulasJava.AJavacoreClasses.Xserializacao.dominio;

import java.io.Serializable;

public class Veiculos implements Serializable {
    private String placa;
    private String motorista;
    private int Kmrodados;
    private int entregasRealizadas;

    public Veiculos(String placa, String motorista, int kmrodados, int entregasRealizadas) {
        this.placa = placa;
        this.motorista = motorista;
        Kmrodados = kmrodados;
        this.entregasRealizadas = entregasRealizadas;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "placa=" + placa +
                ", motorista='" + motorista + '\'' +
                ", Kmrodados=" + Kmrodados +
                ", entregasRealizadas=" + entregasRealizadas +
                '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public int getKmrodados() {
        return Kmrodados;
    }

    public void setKmrodados(int kmrodados) {
        Kmrodados = kmrodados;
    }

    public int getEntregasRealizadas() {
        return entregasRealizadas;
    }

    public void setEntregasRealizadas(int entregasRealizadas) {
        this.entregasRealizadas = entregasRealizadas;
    }
}
