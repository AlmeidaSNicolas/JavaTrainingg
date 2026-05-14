package Exercicios;

public class exBreak {
    public static void main(String[] args) {
        //dado um valor de um carro descubra em quantas vezes ele pode ser parcelado
        //condição é que o valor da parcela tem que ser >= a 1000

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++){
                double valorParcela = valorTotal / parcela;
                if(valorParcela >= 1000){
                    System.out.println("Parcela de " + parcela + "RS " + valorParcela);
                    break;
                }
        }
    }

}
