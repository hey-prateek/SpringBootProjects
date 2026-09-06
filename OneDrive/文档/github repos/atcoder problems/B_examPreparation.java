import java.util.Scanner;

public class B_examPreparation {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            int a, b;
            long res = 0;
            while (n-- > 0) {
                a = sc.nextInt();
                b = sc.nextInt();
                if (t > a) {
                    res += ((t - a) * b);
                }
            }
            System.out.println(res);
        }
    }
}
