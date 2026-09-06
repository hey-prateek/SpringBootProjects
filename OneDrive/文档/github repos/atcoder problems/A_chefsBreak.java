import java.util.Scanner;

public class A_chefsBreak {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            long n = sc.nextInt(), m = sc.nextInt(), r = sc.nextInt();
            long res = 0;
            res += (m * r);
            while (n-- > 0) {
                res += sc.nextInt();
            }
            System.out.println(res);
        }
    }
}
