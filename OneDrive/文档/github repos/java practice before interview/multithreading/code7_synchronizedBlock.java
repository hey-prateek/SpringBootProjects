class task {
    void prints() {
        synchronized (this) { //lets only at a time enter this block, if threads are of same object
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " " + (1 + i));
            }
        }
    }
}

public class code7_synchronizedBlock {

    public static void main(String[] args) {
        task t = new task();
        Thread t1 = new Thread(() -> t.prints(), "thread-1");
        t1.start();
        Thread t2 = new Thread(() -> t.prints(), "thread-2");
        t2.start();
    }
}
