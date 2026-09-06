package all_combined;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

//Use Supplier<List<Integer>> to generate random numbers, filter evens with Predicate, 
//double them with UnaryOperator, and print with Consumer
public class code2 {

    public static void main(String[] args) {

        Supplier<List<Integer>> supp = () -> {
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                lst.add((int) (Math.random() * 100));
            }
            return lst;
        };
        Predicate<Integer> pred = s -> s % 2 == 0;
        UnaryOperator<Integer> uop = s -> s * 2;
        Consumer<Integer> cons = System.out::println;

        (supp.get()).stream().filter(pred).map(uop).forEach(cons);
    }

}
