
import java.util.*;
public class Draw_a_Square {
    public static void main(String[] args) {

        // take input for number of test cases
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        // running code for each test case
        while(testcases-- >0)
        {
            int l,d,r,u;
            l=sc.nextInt();
            r=sc.nextInt();
            d=sc.nextInt();
            u=sc.nextInt();

            // check if all are same then output square
            if(l==r && r==d && d==u)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }


    }
}