import java.util.Scanner;

public class C_choosingSouvenirs {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            int t = sc.nextInt();
            int a, b;
            int res = -1, tste = -1, pri = r;
            for (int i = 1; i <= n; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                if (res != -1 && (a < pri && a >= l && a <= r) && b >= t) {
                    res = i;
                    tste = b;
                    pri = a;
                    // System.out.println(res);
                } else if (res != -1 && (a <= pri && a >= l && a <= r) && b > tste) {
                    res = i;
                    tste = b;
                    pri = a;
                    // System.out.println(res);
                } else if (res == -1 && (a >= l && a <= r) && b >= t) {
                    res = i;
                    tste = b;
                    pri = a;
                    // System.out.println(res);
                }
            }

            System.out.println(res);
        }
    }
}
