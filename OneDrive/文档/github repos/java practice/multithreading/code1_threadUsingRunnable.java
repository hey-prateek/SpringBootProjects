class task implements Runnable
{
    public void run()
    {
        System.out.println("inside run method..."+Thread.currentThread().getName());
    }
}

public class code1_threadUsingRunnable {
    public static void main(String[] args)
    {
        Thread t1=new Thread(new task(), "task1");
        Thread t2=new Thread(new task(), "task2");
        t1.start();
        t2.start();

    }
}
