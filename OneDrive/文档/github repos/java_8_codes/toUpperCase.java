//List of Names to Uppercase

import java.util.Arrays;
import java.util.List;

public class toUpperCase {
    public static void main(String[] main)
    {
        List<String> lst=Arrays.asList("hey", "prateek", "tiwari");

        lst.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
