import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.function.Function;

public class code21_genericFunctionExample {
    
    public static <T,R> List<R> genericFunction( List<T> lst, Function<T,R> function)
    {
        return lst.stream().map(function).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        
        List<String> slst=new ArrayList<>(Arrays.asList("hey", "prateek", "tiwari"));
        List<Integer> ilst=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        List<String> res1=genericFunction(slst, String::toUpperCase);
        
        List<Integer> res2=genericFunction(ilst, i->i*10);
        
        res1.forEach(s->System.out.println(s));
        
        res2.forEach(s->System.out.println(s));
    }
}
