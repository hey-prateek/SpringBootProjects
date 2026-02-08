import java.time.*;
import java.time.format.DateTimeFormatter;

public class dateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println(date + " " + time);

        System.out.println(date.getMonth() + " " + date.getYear() + " " + date.getDayOfWeek());

        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-mm-dd hh:mm");
        String current=now.format(format);
        System.out.println(current);

    }
}
