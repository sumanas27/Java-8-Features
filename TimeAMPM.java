import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAMPM {
    public static void main(String args[]){
        Date date = new Date();
        String strPattern = "HH:mm:ss a";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strPattern);
        System.out.println(simpleDateFormat.format(date));
    }
}
