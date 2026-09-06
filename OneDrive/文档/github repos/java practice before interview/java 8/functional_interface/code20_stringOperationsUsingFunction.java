import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;

public class code20_stringOperationsUsingFunction {
    

    public static void main(String[] args) {
        
        String str="hey prateek";
        
        //to get string length
        Function<String, Integer> func=s->s.length();
        
        //to convert string to upper case
        Function<String, String> func1=s->s.toUpperCase();
        
        //combining 2 functions to convert to upper case and then get length
        Function<String, Integer> func2=func1.andThen(func);
        
        //fucntion to trim spaces of a string
        Function<String, String> func3=s->{
            String res="";
            for(int i=0; i<s.length(); i++)
            {
                if(s.charAt(i)!=' ')
                res+=s.charAt(i);
            }
            return res;
        };
        
        System.out.println(func1.apply(str));
        System.out.println(func2.apply(str));
        System.out.println(func3.apply(str));

    }
}
