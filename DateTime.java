import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTime {

    private void calenderHandling() {
        Calendar calendar = new GregorianCalendar(2019, 11,29);
        Calendar cal = Calendar.getInstance();
        // To show only in the number form
        String s1 = String.format("The date is %tm, %1$te, %1$ty", calendar);
        // To show month in Full String and others in number form
        String s2 = String.format("The date is %1$tB, %1$tb, %1$tm", calendar);
        // To show current time
        String s3 = String.format("The time is %tH, %1$tM", cal);
        // To show current Timestamp
        String s4 = String.format("The current date is %tc", cal);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }

    private void dateHandling(){
        Date date = new Date();
        // To show Seconds to run the application
        SimpleDateFormat seconds = new SimpleDateFormat("ss");
        // To show current month in the number form
        SimpleDateFormat monthsPattern1  = new SimpleDateFormat("MM");
        // To show current month in Full string
        SimpleDateFormat monthsPattern2  = new SimpleDateFormat("MMMM");
        System.out.println("Seconds : " + seconds.format(date));
        System.out.println("Months : " + monthsPattern1.format(date));
        System.out.println("Months Full :" + monthsPattern2.format(date));

    }

    private void dateFormatHandling() {
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        // Lambda expressions
        Arrays.stream(shortMonths).forEach(i -> System.out.println(i));
        for (String s : shortMonths) {
            System.out.println(s);
        }
    }


    public static void main (String args[]){

        DateTime dateTime = new DateTime();
        dateTime.calenderHandling();
        dateTime.dateHandling();
        dateTime.dateFormatHandling();


    }
}
