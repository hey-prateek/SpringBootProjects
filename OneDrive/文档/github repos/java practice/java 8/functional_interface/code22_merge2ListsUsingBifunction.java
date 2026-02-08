import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class code22_merge2ListsUsingBifunction {

    static <T> List<T> merge2lsts(List<T> lst1, List<T> lst2)
    {
        List<T> res=new ArrayList<>(lst1);
        res.addAll(lst2);
        return res;

    }

    public static void main(String[] args)
    {
        List<Integer> lst1=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> lst2=new ArrayList<>(Arrays.asList(6,7,8,9,10));

        BiFunction<List<Integer>, List<Integer>, List<Integer>> bfunc = (s,s1) -> merge2lsts(s,s1);

        List<Integer> reslst=bfunc.apply(lst1, lst2);
        reslst.forEach(System.out::println);


    }
    
}
