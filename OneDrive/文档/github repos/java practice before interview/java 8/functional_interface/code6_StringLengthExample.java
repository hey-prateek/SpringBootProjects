import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class code6_StringLengthExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("harish", "esther", "iriana", "prateek");

        Function<String, Integer> getLength = String::length;

        List<Integer> lengths = list.stream()
                                    .map(getLength)
                                    .collect(Collectors.toList());

        System.out.println(lengths);
    }
}
