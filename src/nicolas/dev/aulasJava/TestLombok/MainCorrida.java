package nicolas.dev.aulasJava.TestLombok;

public class MainCorrida {
    public static void main(String[] args) {

        RegistroCorrida corridaDeHoje = new RegistroCorrida();
        corridaDeHoje.setClima("sol");
        corridaDeHoje.setDuracaoMinutos(80);
        corridaDeHoje.setDistanciaKm(10);


        System.out.println(corridaDeHoje);
    }
}
