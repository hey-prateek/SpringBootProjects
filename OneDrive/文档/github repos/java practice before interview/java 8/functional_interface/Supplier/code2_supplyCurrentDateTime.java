package Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class code2_supplyCurrentDateTime {
    public static void main(String[] args) {

        Supplier<LocalDateTime> sldt = () -> LocalDateTime.now();
        System.out.println(sldt.get());
    }
}
