public class code4_threadMethods_startRunSleep {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> { // run method created using lambda
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000); // sleep method
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start(); // start method
    }
}
