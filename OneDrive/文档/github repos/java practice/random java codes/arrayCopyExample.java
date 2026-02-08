import java.util.Arrays;

public class arrayCopyExample {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        int[] res = new int[3];
        System.arraycopy(arr, 0, res, 0, 3);

        for (int i : res) {
            System.out.println(i);
        }

        int[] res1 = Arrays.copyOf(arr, 3);
        for (int i : res1) {
            System.out.println(i);
        }
    }
}
