package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.Dominio02;

import nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.dominio.Validavel;

public abstract class Veiculo implements Validavel, Inspecionavel{
    String placa;
    int quilometragem;
    CategoriaHabilitacao categoriaHabilitacao;

    public Veiculo(String placa, int quilometragem, CategoriaHabilitacao categoriaHabilitacao) {
        this.placa = placa;
        this.quilometragem = quilometragem;
        this.categoriaHabilitacao = categoriaHabilitacao;
    }

    @Override
    public boolean validarDados() {
        return false;
    }

    public abstract double calcularValorAluguel(int dias);

    void emitirContrato(int dias){
        System.out.println("Placa : " + this.placa);
        System.out.println("Categoria Exigida : " + this.categoriaHabilitacao);
        System.out.println("Dias Alugados : " + dias);
        System.out.println("Valor total : " + calcularValorAluguel(dias) );
    }
}
