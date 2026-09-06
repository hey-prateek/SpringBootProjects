import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class code8_stringToDate {
    public static void main(String[] args) {
       
        String dateStr = "08-08-2025";
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        
        Function<String, LocalDate> f= s -> LocalDate.parse(s, formatter);

        System.out.println(f.apply(dateStr)); 
    }
}
