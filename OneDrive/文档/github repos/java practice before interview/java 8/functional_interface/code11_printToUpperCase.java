import java.util.*;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;

public class code11_printToUpperCase {
    public static void main(String[] args) {
       
       List<String> slist=new ArrayList<>(Arrays.asList("400 - bad request", 
       "401 - unauthorized",
       "403 - forbidden",
       "404 - not found",
       "500 - internal server error",
       "502 - bad gateway",
       "503 - service unavailable",
       "504 - gateway timeout"
       ));
       
       Consumer<String> c=s -> System.out.println(s.toUpperCase());
       
       slist.forEach(c);
    }
}