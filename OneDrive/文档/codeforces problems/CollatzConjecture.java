import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();

        while(tc-->0)
        {
            int k=sc.nextInt(), x=sc.nextInt();
            //x*2power(k)
            System.out.println((int)(x*Math.pow(2, k)));
        }
    }
}
