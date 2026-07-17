package nicolas.dev.aulasJava.SuperExercicioGemini.domain;

public class Aeronave {
    private String prefixo;
    private String modelo;
    private int capacidadeDePassageiros;
    public final static String NOME_DA_COMPANHIA = "AIR_NS";

    public Aeronave(String prefixo, String modelo, int capacidadeDePassageiros) {
        this.prefixo = prefixo;
        this.modelo = modelo;
        this.capacidadeDePassageiros = capacidadeDePassageiros;
    }

    public String getPrefixo() { return prefixo; }
    public void setPrefixo(String prefixo) { this.prefixo = prefixo; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getCapacidadeDePassageiros() { return capacidadeDePassageiros; }
    public void setCapacidadeDePassageiros(int capacidadeDePassageiros) { this.capacidadeDePassageiros = capacidadeDePassageiros; }
}