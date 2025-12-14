import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LTime {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        String date = LocalDate.now().format(dtf);
        System.out.println("Today's date is " + date);
    }
}
