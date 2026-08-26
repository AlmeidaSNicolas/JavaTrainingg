package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class InternacionalizaçãoDeMoedas {
    public static void main(String[] args) {

        Locale localPt = new Locale("pt", "BR");
        Locale localJP = Locale.JAPAN;
        Locale LOCALgERMANY = Locale.GERMANY;
        Locale localDefault = Locale.getDefault();

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance(localPt);
        nfa[1] = NumberFormat.getInstance(localJP);
        nfa[2] = NumberFormat.getInstance(LOCALgERMANY);
        nfa[3] = NumberFormat.getNumberInstance(localDefault);

        double valor = 100_00;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

        String valor1 = "100";
        System.out.println(Double.parseDouble(valor1));


    }
}
