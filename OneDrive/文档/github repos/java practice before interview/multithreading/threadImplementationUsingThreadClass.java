class myThread extends Thread
{
    public void run()
    {
        System.out.println("inside thread class...");
    }
}

public class threadImplementationUsingThreadClass
{
    public static void main(String[] args)
    {
        myThread thread=new myThread();
        thread.run();
    }
}