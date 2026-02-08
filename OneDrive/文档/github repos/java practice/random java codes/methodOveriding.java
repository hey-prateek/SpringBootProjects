class parent {
    void printing()
    {
        System.out.println("parent method....");
    } 
}
class subclass extends parent
{
    void printing()
    {
        super.printing(); //calling parent data or method using super keyword
        System.out.println("child method....");
    } 
}
public class methodOveriding
{
    public static void main(String[] args)
    {
        subclass s=new subclass();
        s.printing();
        // ((parent) s).printing(); //doesnt work

        main(10,"prateek"); //overloading the main method
    }

    public static void main(int n, String s)
    {
        System.out.println(n+" "+s);
    }
}

