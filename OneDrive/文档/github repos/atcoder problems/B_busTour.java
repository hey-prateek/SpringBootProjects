import java.util.Scanner;

public class B_busTour {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a, b;
            long res = 0;
            while (n-- > 1) {
                a = sc.nextInt();
                b = sc.nextInt();
                res += a;
                res -= Math.min(res, b);
            }
            res += sc.nextInt();
            System.out.println(res);
        }
    }
}
