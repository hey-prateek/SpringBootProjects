class myThread extends Thread
{
    public void run()
    {
        print();
    }

    static synchronized void print()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

public class staticSynchronizedMethod {
    public static void main(String[] args)
    {
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.start();
        t2.start();
    }
}
