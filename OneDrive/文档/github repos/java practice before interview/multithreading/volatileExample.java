class SharedData {
    volatile boolean flag = false;
}

public class volatileExample {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        new Thread(() -> {
            while (!data.flag) {
                // busy wait until flag becomes true
                System.out.println("busy wait until flag becomes true");
            }
            System.out.println("Flag detected as true!");
        }).start();

        try { Thread.sleep(10); } catch (InterruptedException e) {}

        data.flag = true; // immediately visible to other thread
        System.out.println("Flag set to true");
    }
}
