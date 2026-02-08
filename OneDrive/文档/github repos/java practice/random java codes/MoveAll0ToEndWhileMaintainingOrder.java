import java.util.ArrayList;
import java.util.List;

public class MoveAll0ToEndWhileMaintainingOrder {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 0, 2, 0, 3, 0, 4, 0, 5 };

        for (int i : fix(arr)) {
            System.out.print(i + " ");
        }
    }

    static List<Integer> fix(int[] arr) {
        List<Integer> res = new ArrayList<>();
        for (int i : arr) {
            if (i != 0) {
                res.add(i);
            }
        }
        int count = arr.length - res.size();
        for (int i = 0; i < count; i++) {
            res.add(0);
        }
        return res;

    }
}
