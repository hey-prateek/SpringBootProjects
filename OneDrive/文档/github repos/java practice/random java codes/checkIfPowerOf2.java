// Given an integer, write a function to determine if it is a power of two

// a number n is a power of two if it
// has exactly one bit set to 1 in its binary representation. Using the expression n & (n - 1),
// we can zero out the lowest set bit; if the result is 0, then n was a power of two

public class checkIfPowerOf2 {
    public static void main(String[] args) {
        int a = 20, b = 16, c = 8;
        System.out.print(power(a) + " " + power(b) + " " + power(c));
    }

    static Boolean power(int x) {
        return ((x > 1) && ((x & (x - 1)) == 0));
    }
}
