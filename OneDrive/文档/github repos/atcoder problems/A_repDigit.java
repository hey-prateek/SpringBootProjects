import java.util.Scanner;

class A_repDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt(), temp = N % 10;
            while (N > 0) {
                if (N % 10 != temp) {
                    System.out.println("No");
                    return;
                } else {
                    N = N / 10;
                }
            }
        }
        System.out.println("Yes");
    }
}