import java.util.Scanner;

class A_strongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == (s.charAt(s.length() - 1)))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}