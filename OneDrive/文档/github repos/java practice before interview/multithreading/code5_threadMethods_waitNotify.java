class sharedResource {
    
    void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("resource produced...");
            wait();
            System.out.println("continued after wait is over...");
        }
    }

    void consume() throws InterruptedException {
        synchronized (this) {
            Thread.sleep(1000); // ensures producer starts first
            System.out.println("resource consumed...");
            notify();
            System.out.println("continued after notified...");
        }
    }
}

public class code5_threadMethods_waitNotify {
    public static void main(String[] args) {
        sharedResource sr = new sharedResource();
        Thread producer = new Thread(() -> {
            try {
                sr.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producer.start();

        Thread consumer = new Thread(() -> {
            try {
                sr.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        consumer.start();

    }
}
