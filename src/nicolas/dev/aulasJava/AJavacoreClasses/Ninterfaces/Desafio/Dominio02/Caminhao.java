package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.Dominio02;

public class Caminhao extends Veiculo implements Inspecionavel {
    int quantidadeEixos;

    public Caminhao(String placa, int quilometragem, CategoriaHabilitacao categoriaHabilitacao, int quantidadeEixos) {
        super(placa, quilometragem, categoriaHabilitacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorAluguel(int dias) {
        dias = 200;
        int extraPorEixo = 50;
        double valorMultiplicadoPorDias = dias * extraPorEixo;
        return valorMultiplicadoPorDias;
    }

    @Override
    void emitirContrato(int dias) {
        super.emitirContrato(dias);
    }

    @Override
    public boolean aprovarInspecao() {
        if(quilometragem < 150000){
            System.out.println("Aprovado no aluguel");
            return true;
        }else{
            System.out.println("Quilomatragem acima do exigido");
            return false;
        }
    }
}
