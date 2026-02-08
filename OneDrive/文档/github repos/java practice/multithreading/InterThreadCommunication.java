class SharedBuffer {
    private int data;
    private boolean hasData = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait(); // wait until consumed
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // wake up consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (!hasData) {
            wait(); // wait until produced
        }
        System.out.println("Consumed: " + data);
        hasData = false;
        notify(); // wake up producer
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { buffer.produce(i); } catch (Exception ignored) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try { buffer.consume(); } catch (Exception ignored) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
