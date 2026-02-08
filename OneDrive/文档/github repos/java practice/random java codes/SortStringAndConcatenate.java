import java.util.Arrays;

public class SortStringAndConcatenate {
    public static void main(String[] args) {
        String[] str = new String[] { "Hey", "Prateek", "Tiwari", "Accenture" };
        System.out.print(sortConc(str));
    }

    static String sortConc(String[] str) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(str);
        for (String s : str) {
            res.append(s);
        }

        return res.toString();
    }
}
