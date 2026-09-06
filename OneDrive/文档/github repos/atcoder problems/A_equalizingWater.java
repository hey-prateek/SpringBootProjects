import java.util.Scanner;

public class A_equalizingWater {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            long res = 0;
            int temp = n;
            while (temp-- > 0) {
                res += sc.nextInt();
            }
            System.out.println(res % n == 0 ? "Yes" : "No");
        }

    }
}
