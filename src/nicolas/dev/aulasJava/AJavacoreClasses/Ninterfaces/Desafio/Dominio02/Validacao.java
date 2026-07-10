package nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.Dominio02;

import nicolas.dev.aulasJava.AJavacoreClasses.Ninterfaces.Desafio.dominio.Validavel;

public class Validacao {

    public static void processarAluguel(Veiculo veiculo, int dias){
        if(veiculo.aprovarInspecao()){
            veiculo.emitirContrato(dias);
        }else{
            System.out.println("Aviso: Veiculo da placa : " + veiculo.placa + " Retido na inspeção, contrato cancelado" );
        }
    }
}
