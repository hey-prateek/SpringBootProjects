import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class myThread extends Thread
{
    public static Lock lock=new ReentrantLock();
    public void run()
    {
        lock.lock();
        print();
        lock.unlock();
    }
    public void print()
    {
        for(int i=1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

public class reentrantLock {
    public static void main(String[] args)    
    {
        myThread t1=new myThread();
        myThread t2=new myThread();

        t1.start();
        t2.start();
    }
}
