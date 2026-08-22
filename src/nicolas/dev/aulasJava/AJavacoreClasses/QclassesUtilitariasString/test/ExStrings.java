package nicolas.dev.aulasJava.AJavacoreClasses.QclassesUtilitariasString.test;

public class ExStrings {
    public static void main(String[] args) {


        StringBuilder formatando = new StringBuilder("514.778.728-33");

        System.out.println(formatando.replace(4,11, "########"));


        StringBuilder ex1 = new StringBuilder("Aprender java é muito dificil");
        System.out.println(ex1.replace(22,29, "Facil").append('!'));

        StringBuilder sb = new StringBuilder("123456");
        System.out.println(sb.delete(1,3).append("789").reverse());

    }
}
