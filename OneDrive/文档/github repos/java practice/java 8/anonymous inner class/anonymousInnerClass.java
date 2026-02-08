public class anonymousInnerClass {
    public static void main(String[] args1) {

        // outer class variable name
        String name = "outer main class1";

        Runnable r = new Runnable() {

            // anonymous inner class
            String name = "inner class name...";

            public void run() {
                //prints inner class name
                System.out.println(this.name);
            }
        };

        Thread t = new Thread(r);
        t.run();

    }
}