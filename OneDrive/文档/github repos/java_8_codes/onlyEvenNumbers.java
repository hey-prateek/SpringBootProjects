import java.util.Arrays;

class onlyEvenNumbers {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Arrays.stream(arr).filter(s -> s % 2 == 0).forEach(System.out::println);

    }
}