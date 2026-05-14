package Exercicios;

public class exSwitch {
    public static void main(String[] args) {
        // dados os valores de 1 a 7 imprima se é dia util ou final de semana
        //considerando 1 como domingo

        byte dia = 10;

        switch (dia){
            case 1 -> System.out.println("Final de semana");
            case 2 -> System.out.println(" Dia Util ");
            case 3 -> System.out.println(" Dia Util ");
            case 4 -> System.out.println(" Dia Util ");
            case 5 -> System.out.println(" Dia Util ");
            case 6 -> System.out.println(" Dia Util ");
            case 7 -> System.out.println("Final de semana");
            default -> System.out.println("Diga seu dia de 1 a 7");
        }
    }
}
