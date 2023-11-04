import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeFromat = new SimpleDateFormat("hh:mm:ss a");
        System.out.println(timeFromat.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat .format(currentDate));

        SimpleDateFormat dayOfTheWeekFormat = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeekFormat.format(currentDate));

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate));
    }
}
