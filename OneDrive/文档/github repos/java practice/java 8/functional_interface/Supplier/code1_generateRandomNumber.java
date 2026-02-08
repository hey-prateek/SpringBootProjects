package Supplier;

import java.util.function.Supplier;

public class code1_generateRandomNumber {
    public static void main(String[] args) {
        
        Supplier<Integer> sup=()->(int)(Math.random()*100);
        System.out.print(sup.get());
    }
    
}
