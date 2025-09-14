// Sort a list of integers in ascending order

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sortList {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(5, 4, 3, 1, 2, 6);

        lst.stream().sorted().forEach(System.out::println);
        System.out.println();
        lst.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
