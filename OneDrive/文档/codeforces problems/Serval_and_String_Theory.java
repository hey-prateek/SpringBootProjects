// WRONG CODE

import java.util.Scanner;
public class Serval_and_String_Theory
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0)
        {
            int length=sc.nextInt();
            int k=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            calling_logic(length, k, s);
            

        }

        }
    

    static void calling_logic(int length, int k, String s)
    {
        String rev_s=reverseString(s);
            if(s.charAt(0)<rev_s.charAt(0))
            {
                System.out.println("yes");
                return;
            }
            else
            {
                if(k==0)
                {
                    System.out.println("no");
                    return;
                }
                int flag=0;
            for(int i=1;i<=s.length()-1;i++)
            {
                
                if(s.charAt(i)!=s.charAt(i-1))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("no");
                return;
            }
            if(flag==1  && k>0)
            {
                System.out.println("yes");
                return;
            }
    }}

        static String reverseString(String s)
        {
            return new StringBuilder(s).reverse().toString();
        }
    
}