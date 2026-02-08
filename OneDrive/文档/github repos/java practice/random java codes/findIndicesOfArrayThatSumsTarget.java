import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class findIndicesOfArrayThatSumsTarget {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 10;

        List<Integer> res = findIndex(arr, target);
        for (Integer i : res) {
            System.out.println(i);
        }
    }

    static List<Integer> findIndex(int[] arr, int target) {

        List<Integer> res = new ArrayList<>();
        List<Integer> temp = Arrays.stream(arr).boxed().collect(Collectors.toList());

        // traverse whole list
        // for each element check if list contains mod(target-i)
        // if yes return both indices

        int rem;
        for (int i = 0; i < temp.size(); i++) {
            rem = Math.abs(target - arr[i]);
            if (temp.contains(Integer.valueOf(rem))) {
                res.add(i);
                res.add(temp.indexOf(rem));
                return res;
            }
        }

        return res;
    }
}