//Calculate the sum of elements in a list of integers

import java.util.Arrays;
import java.util.List;

public class sumOfElements {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1, 2, 3, 4, 5);

        int res = lst.stream().mapToInt(Integer::intValue).sum();

        System.out.print(res);
    }
}
