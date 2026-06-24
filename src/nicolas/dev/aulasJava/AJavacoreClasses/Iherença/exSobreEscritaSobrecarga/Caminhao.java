package nicolas.dev.aulasJava.AJavacoreClasses.Iherença.exSobreEscritaSobrecarga;

public class Caminhao extends Veiculo {

    @Override
    public void acelerar() {
        super.acelerar();
        System.out.println("O veiculo esta acelerando pesado, velocidade maxima permitida: " + getVelocidadeMaxima());
    }

    public Caminhao(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }


}
