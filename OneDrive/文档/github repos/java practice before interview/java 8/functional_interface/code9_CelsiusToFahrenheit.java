import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class code9_CelsiusToFahrenheit {
    public static void main(String[] args) {
        List<Double> celsiusList = Arrays.asList(0.0, 25.0, 37.0, 100.0);

        Function<Double, Double> toFahrenheit = c -> (c * 9 / 5) + 32;

        List<Double> fahrenheitList = celsiusList.stream()
                                                 .map(toFahrenheit)
                                                 .collect(Collectors.toList());

        System.out.println(fahrenheitList);
    }
}