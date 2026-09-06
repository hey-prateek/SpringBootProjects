import java.util.Scanner;

public class B_centreAlignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
            if (arr[i].length() > max)
                max = arr[i].length();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i].length() < max) {
                String temp = ".".repeat((max - arr[i].length()) / 2);
                System.out.println(temp + arr[i] + temp);
            } else
                System.out.println(arr[i]);
        }

    }
}
