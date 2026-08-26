package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExGlobal {
    public static void main(String[] args) {

        Locale localPt = new Locale("pt", "BR");
        Locale localUs = Locale.US;
        Locale localjp = Locale.JAPAN;

        double valor = 12500.50;

        NumberFormat[] nfa = new NumberFormat[3];
        nfa[0] = NumberFormat.getCurrencyInstance(localPt);
        nfa[1] = NumberFormat.getCurrencyInstance(localUs);
        nfa[2] = NumberFormat.getCurrencyInstance(localjp);

        System.out.println("====== Formatação de Moedas =======");
        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }
        System.out.println("====================================");


       Calendar calendarCompra = Calendar.getInstance();
       calendarCompra.set(26, 11, 10);

        Date dateCOmpra = calendarCompra.getTime();

        SimpleDateFormat spdf = new SimpleDateFormat("dd/MM/YYYY HH:MM:ss");
        System.out.println("Data da compra " + spdf.format(dateCOmpra));


        System.out.println("=== Data entrega ex ====");

        LocalTime lc1 = LocalTime.now();
        System.out.println("Hora exata da compra : " + lc1);

        LocalDate DATAhoJE = LocalDate.now();
        LocalDate dataLimite = DATAhoJE.plusDays(12);

        Date entrega = java.sql.Date.valueOf(dataLimite);

        DateFormat dfull = DateFormat.getDateInstance(DateFormat.FULL, localPt);
        System.out.println("Previsao de entrega : " + dfull.format(entrega));


    }
}
