package nicolas.dev.aulasJava.AJavacoreClasses.Pexception.Ex2.Model;

public class Personagem {
    private double pesoAtual;
    private double capacidadeMaxima;

    public Personagem(double pesoAtual, double capacidadeMaxima) {
        this.pesoAtual = pesoAtual;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void saquearItem(double pesoDoItem) throws MochilaRasgadaException{
       double totalPeso = pesoDoItem + pesoAtual;

       if(totalPeso > capacidadeMaxima){
           throw new MochilaRasgadaException("Peso estourou o limite e sua mochila rasgou");
       }else{
           double pesoFinal = pesoDoItem + pesoAtual;
           System.out.println("Peso atual: " + pesoFinal);
       }
    }



}
