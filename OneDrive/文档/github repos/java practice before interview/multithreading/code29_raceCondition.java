public class code29_raceCondition {
    private static int counter = 0;

    public static void main(String[] args) throws Exception {
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                counter++;
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter); // might not always be 2000, solution is used synchronized method or
                                     // atomicInteger
    }
}
