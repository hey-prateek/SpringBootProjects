// List First Names

import java.util.Arrays;
import java.util.List;

public class listFirstNames {
    public static void main(String[] args)
    {
        List<String> lst=Arrays.asList("Prateek Tiwari", "Muskan Singh", "Amitabh Bachchan");

        lst.stream().map( s -> s.split(" ")[0]).forEach(System.out::println);
    }
}
