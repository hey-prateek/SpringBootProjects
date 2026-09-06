import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class temp {
    public static void main(String[] args)
    {
        List<String> lst=Arrays.asList("hey", "prateek", "hey");
        lst.stream().filter(s->Collections.frequency(lst, s)>1).forEach(System.out::println);
    }
    
}
