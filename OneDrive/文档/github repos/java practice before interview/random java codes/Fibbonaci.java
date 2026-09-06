import java.util.HashMap;
import java.util.Map;

public class Fibbonaci {

    // Cache to store already computed Fibonacci numbers
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {
        int n = 6; // 0 1 1 2 3 5

        for (int i = 0; i < n; i++) {
            System.out.println(fibbRec(i));
        }
    }

    // with recursion
    static int fibbRec(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }

        // If already computed, return from cache
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        // Compute and store in cache
        int value = fibbRec(n - 1) + fibbRec(n - 2);
        cache.put(n, value);

        return value;
    }
}
