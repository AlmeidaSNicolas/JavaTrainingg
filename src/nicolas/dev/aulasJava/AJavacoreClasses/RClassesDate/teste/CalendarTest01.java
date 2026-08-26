package nicolas.dev.aulasJava.AJavacoreClasses.RClassesDate.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        Date date = c1.getTime();

        Calendar.getInstance();
        System.out.println(date);
    }
}
