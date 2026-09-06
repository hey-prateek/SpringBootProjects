public class code11_daemonThread {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while (true) // infinite loop but will stop on its own once user thread is terminated
            {
                System.out.println("daemon thread running...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        daemon.setDaemon(true);
        daemon.start();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("user thread running..." + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        t1.start();

        // daemon thread automatically stops after user thread completes execution
    }
}
