package nicolas.dev.aulasJava.AJavacoreClasses.dominio;

public class imprimir2 {
    public static void imprimir2(carro car) {

        System.out.println("-----------");
        System.out.println("Placa : " + car.placa);
        System.out.println("Documento : " + car.documento);
        System.out.println("Cor : " + car.cor);
        System.out.println("Conta : " + car.getConta());
        System.out.println("Dados Motorista : " + car.getDadosMotorista());
        System.out.println("------------");

    }
}
