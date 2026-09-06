public class CheckIfArmstrongNumber {
    public static void main(String[] args) {
        int a=153, b=123;
        System.out.print(armstrong(a)+" "+armstrong(b));
    }

    static Boolean armstrong(int n)
    {
        int res=0;
        int a=n;
        while(a>0)
        {
            res+=Math.pow(a%10, String.valueOf(n).length());
            a=a/10;
        }
        return (res==n);
    }
}
