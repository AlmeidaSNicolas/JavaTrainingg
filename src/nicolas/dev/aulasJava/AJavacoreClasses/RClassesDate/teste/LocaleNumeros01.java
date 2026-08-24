package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleNumeros01 {
    public static void main(String[] args) {
        //numberFormat
        Locale localDefault = Locale.getDefault();
        Locale localePt = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localePt);
        nfa[2] = NumberFormat.getInstance(localeJP);
         double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }

    }
}
