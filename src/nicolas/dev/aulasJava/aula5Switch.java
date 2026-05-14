package nicolas.dev.aulasJava;

public class aula5Switch {
    public static void main(String[] args) {
        byte dia = 4;

        switch (dia){
            case 1:
                System.out.println("Domingo");
            break;
            case 2:
                System.out.println("Segunda");
            break;
            case 3:
                System.out.println("Terça - Feira");
            break;
            case 4:
                System.out.println("Quarta - Feira");
            break;
            case 5:
                System.out.println("Quinta - Feira");
            break;
            case 6:
                System.out.println("Sexta - Feira");
            break;
            case 7:
                System.out.println("Sabado");
            break;
            default:
                System.out.println("Insira um numero de 1 a 7");

            }

        String mes = "Março";

        switch (mes){
            case "Janeiro", "Feveiro", "Março" -> System.out.printf("Seu mes é %s %ne sua estação é verão", mes);

        }
    }
}
