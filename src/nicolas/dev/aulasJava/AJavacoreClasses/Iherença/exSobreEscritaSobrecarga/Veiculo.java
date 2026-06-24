package nicolas.dev.aulasJava.AJavacoreClasses.Iherença.exSobreEscritaSobrecarga;

public class Veiculo {
    private int velocidadeMaxima;

    public Veiculo(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(){
        System.out.println("O veiculo esta acelerando");
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
