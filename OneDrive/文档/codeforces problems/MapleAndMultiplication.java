import java.util.Scanner;

public class MapleAndMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-->0)
        {
            int a=sc.nextInt(), b=sc.nextInt();
            if(a==b)
            System.out.println("0");
            else if(a%b==0 || b%a==0)
            {
                System.out.println("1");
            }
            else
            {
                System.out.println("2");
            }
        }
    }
}
