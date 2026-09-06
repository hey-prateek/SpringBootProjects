public class code30_starvation {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(() -> {
            while (true) {
                System.out.println("high priority thread...");
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                System.out.println("high priority thread...");
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start(); // rarely runs due to low priority, solution is dont use priority, reEntrant
                    // lock or proper scheduling algos

        t1.join();
        t2.join();
    }
}
