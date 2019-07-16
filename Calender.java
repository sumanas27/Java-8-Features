import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender {

    public static void main (String args[]){
        Calendar calendar = new GregorianCalendar(2019, 11,29);
        String s1 = String.format("The date is %tm, %1$te, %1$ty", calendar);
        String s2 = String.format("The date is %1$tB, %1$tb, %1$tm", calendar);
        System.out.println(s1);
        System.out.println(s2);
    }
}
