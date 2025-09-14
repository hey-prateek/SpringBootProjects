// Get Distinct Elements

import java.util.Arrays;
import java.util.List;

public class distinct {
    public static void main(String[] args)
    {
        List<Integer> lst = Arrays.asList(1,2,3,4,1,2,3,5,6);

        lst.stream().distinct().forEach(System.out::println);
    }
}
