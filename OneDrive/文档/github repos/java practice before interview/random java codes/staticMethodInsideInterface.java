interface in
{
    static void prints(int x)
    {
        System.out.println("inside static method of interface..."+x);
    }
}

public class staticMethodInsideInterface {
    public static void main(String[] args)
    {
        in.prints(586);
    }
}
