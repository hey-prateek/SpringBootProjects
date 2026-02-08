public class code6_threadMethods_join {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("custom thread printing: " + i);
            }
        });
        t.start();
        t.join(); // main thread waits for t thread to print
        System.out.println("main thread printing...");
    }
}
