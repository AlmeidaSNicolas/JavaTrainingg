package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.Dominio02;

public class Moto extends Veiculo {
    int cilindradas;

    public Moto(String placa, int quilometragem, CategoriaHabilitacao categoriaHabilitacao, int cilindradas) {
        super(placa, quilometragem, categoriaHabilitacao);
        this.cilindradas = cilindradas;
    }

    @Override
    public boolean aprovarInspecao(){
        if(quilometragem <40000){
            System.out.println("Aprovada pro aluguel");
            return true;
        }else{
            System.out.println("Muito acima, veiculo negado!");
            return false;
        }
    }

    @Override
    void emitirContrato(int dias) {
        super.emitirContrato(dias);
    }

    @Override
    public double calcularValorAluguel(int dias) {
        int valorBase = 50;
        if(cilindradas > 500){
            int MotoCara =(valorBase + 20) * dias;
            return MotoCara;
        }else{
            return valorBase * dias;
        }
    }
}
