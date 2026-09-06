import java.util.Scanner;

public class C_factoryTour {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt(), m = sc.nextInt();
            Long[] t = new Long[n];

            t[0] = sc.nextLong();
            for (int i = 1; i < n; i++) {
                t[i] = t[i - 1] + sc.nextLong();
            }

            long s, l, r;
            long res = 0;
            for (int i = 0; i < m; i++) {
                res = 0;
                s = sc.nextLong();
                l = sc.nextLong();
                r = sc.nextLong();
                res += s;
                if (l == 1)
                    res += t[(int) r - 1];
                else
                    res += (t[(int) r - 1] - t[(int) l - 2]);
                System.out.println(res);
            }
        }
    }
}
