import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class code17_GenericFilterExample {

    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        return list.stream()
                   .filter(predicate)
                   .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> words = Arrays.asList("Java", "Spring", "Boot", "JS");

        List<Integer> evenNumbers = filterList(numbers, n -> n % 2 == 0);
        List<String> longWords = filterList(words, w -> w.length() > 4);

        System.out.println(evenNumbers); // [2, 4]
        System.out.println(longWords);   // [Spring]
    }
}
