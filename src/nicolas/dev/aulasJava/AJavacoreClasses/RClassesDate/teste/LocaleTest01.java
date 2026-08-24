package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) throws Exception{

        Calendar c1 = Calendar.getInstance();
        c1.add(Calendar.DAY_OF_MONTH, 10);

        System.out.println(c1.getTime());

        Date d1 = new Date();
        Locale l1 = new Locale("Pt", "BR");
        Locale l2 = Locale.US;
        DateFormat formatadorBr = DateFormat.getDateInstance(DateFormat.FULL, l1);
        DateFormat formatadorUS = DateFormat.getDateInstance(DateFormat.FULL, l2);

        String textoFormatadoBr = formatadorBr.format(d1);
        String textoFormatadoUS = formatadorUS.format(d1);

        System.out.println("Brasil : " + textoFormatadoBr);
        System.out.println("US : " + textoFormatadoUS);

        String data = "22/08/2026";
        SimpleDateFormat s1 = new SimpleDateFormat("dd/MM/yyyy");

        try{
            Date dataConvertida = s1.parse(data);
            System.out.println(dataConvertida);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Locale l3 = new Locale("Ja","JP" );
        double moedaLocal = 10;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(l3);
        System.out.println(numberFormat.format(moedaLocal));

    }
}
