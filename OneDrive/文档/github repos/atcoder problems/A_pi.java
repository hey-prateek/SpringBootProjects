import java.util.Scanner;

public class A_pi {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int d = sc.nextInt();
            float r = (float) d / 2;
            System.out.println((3.141592653589793) * r * r);
        }
    }
}
