// Count the number of elements in a list that are greater than 5

import java.util.Arrays;
import java.util.List;

public class countNumberOfElementsMoreThan5 {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(7, 4, 3, 1, 2, 6);

        System.out.print(lst.stream().filter(s -> s > 5).count());
    }
}
