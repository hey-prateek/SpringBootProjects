import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

public class code18_streamFromDifferentTypes {


    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> str1=lst.stream();
        
        // Array<Integer> arr=new Array(){1,2,3,4,5};
        Integer[] arr=new Integer[]{1,2,3,4,5};
        Stream<Integer>  str2=Arrays.stream(arr);
        
        Stream<Integer> str3=Stream.of(1,2,3,4);
        
        IntStream str4=IntStream.of(1,2,3,4);
        LongStream str5=LongStream.range(1,4);
        DoubleStream str6=DoubleStream.of(1.2, 2.3);
        
        String str="hey prateek wsup";
        Stream<Character> cstream=str.chars().mapToObj(s -> (char)s);
        
    }
}
