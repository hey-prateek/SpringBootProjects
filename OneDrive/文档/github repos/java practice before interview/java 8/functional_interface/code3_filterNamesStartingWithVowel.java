import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Arrays;

public class code3_filterNamesStartingWithVowel {

    public static void main(String[] args) {
        
       ArrayList<String> alist=new ArrayList<>(Arrays.asList("harish", "esther", "iriana", "prateek"));
       
       Predicate<String> p= s -> "aeiou".indexOf(s.charAt(0))!=-1;
       
       alist.stream().filter(p).forEach(s -> System.out.println(s));
    }
}
