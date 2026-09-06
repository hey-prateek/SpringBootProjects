import java.util.Scanner;

public class A_overBudget {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a, b;
            long res = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                a = sc.nextInt();
                b = sc.nextInt();
                if (a > b) {
                    count++;
                    res += (a - b);
                }

            }
            System.out.println(count + " " + res);
        }
    }
}
