import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

public class code19_checkForAnagramUsingBipredicate {
    
    static boolean isAnagram(String s1, String s2)
    {
        for(int i=0; i<s2.length()-1; i++)
        {
            if(s1.indexOf(s2.charAt(i))==-1)
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        
        String s="earth";
        String s1="hearts";
        
        BiPredicate<String, String> bpred=(s2,s3)-> isAnagram(s2,s3);
        
        System.out.print(bpred.test(s, s1));

    }
}
