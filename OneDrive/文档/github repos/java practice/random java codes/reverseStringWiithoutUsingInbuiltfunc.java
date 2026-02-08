class reverseStringWithoutUsingInbuilfunc
{
    public static void main(String[] args)
    {
        String s1="prateek";
        StringBuilder s2=new StringBuilder();
        for(int i=s1.length()-1; i>=0; i--)
        {
            s2.append(s1.charAt(i));
        }
        System.out.print(s2);
    }
}