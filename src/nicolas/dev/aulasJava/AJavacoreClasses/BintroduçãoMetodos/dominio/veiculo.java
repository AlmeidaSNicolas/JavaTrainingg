package nicolas.dev.aulasJava.AJavacoreClasses.BintroduçãoMetodos.dominio;

public class veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double capacidadeTanque;
    private double consumo;

    public veiculo(String placa, String marca, String modelo, double capacidadeTanque, double consumo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
        this.consumo = consumo;
    }

    public String getPlaca(){
        return placa;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public double getConsumo(){
        return consumo;
    }

    public double getCapacidadeTanque(){
        return capacidadeTanque;
    }

    public class carro extends  veiculo{

        public carro(String placa, String marca, String modelo, double capacidadeTanque, double consumo){
            super(placa,marca,modelo,capacidadeTanque, consumo);
        }

    }

    public class caminhao extends veiculo{
        private double pesoCarga;

        public caminhao(String placa, String marca, String modelo, double capacidadeTanque){
            super(placa,marca,modelo,capacidadeTanque,consumo);
        }


    }



}


