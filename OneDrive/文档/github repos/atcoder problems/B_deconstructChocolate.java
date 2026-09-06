import java.util.Scanner;

public class B_deconstructChocolate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int h = sc.nextInt();
            int q = sc.nextInt();
            int w = sc.nextInt();
            int hq, num;
            while (w-- > 0) {
                hq = sc.nextInt();
                num = sc.nextInt();
                if (hq == 1) {
                    System.out.println(q * num);
                    h -= num;
                } else {
                    System.out.println(h * num);
                    q -= num;
                }
                // System.out.println("rows: " + h + " colums: " + q);
            }
        }
    }
}
