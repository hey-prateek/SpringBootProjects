// using runnable interface the same counter variable is getting updated, but not using thread class

class c1 extends Thread {
    int counter = 0;

    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName() + " " + counter++);
    }
}

class c2 implements Runnable {
    int counter = 0;

    public void run() {
        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName() + " " + counter++);
    }
}

public class code2_threadClassAndRunnableResourceSharing {
    public static void main(String[] args) {
        c1 t1 = new c1();
        t1.setName("thread 1");
        t1.start();
        c1 t2 = new c1();
        t1.setName("thread 2");
        t2.start();

        c2 temp = new c2();
        Thread t3 = new Thread(temp, "thread 3");
        t3.start();
        Thread t4 = new Thread(temp, "thread 4");
        t4.start();
    }
}
