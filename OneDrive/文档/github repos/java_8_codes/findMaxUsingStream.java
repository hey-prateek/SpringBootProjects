// Find the maximum value in a list of integers

import java.util.Arrays;
import java.util.List;

public class findMaxUsingStream {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);

        int res = lst.stream().mapToInt(Integer::intValue).max().orElseThrow();

        System.out.print(res);
    }
}
