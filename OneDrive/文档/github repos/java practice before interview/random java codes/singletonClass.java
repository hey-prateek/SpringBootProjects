public class singletonClass {

    // Step 1: Create a private static instance
    private static singletonClass instance;

    // Step 2: Make constructor private so no one can instantiate
    private singletonClass() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Provide a public static method to get the instance
    public static singletonClass getInstance() {
        if (instance == null) {         // Lazy initialization
            instance = new singletonClass();
        }
        return instance;
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Singleton s1 = Singleton.getInstance();
//         Singleton s2 = Singleton.getInstance();

//         System.out.println(s1 == s2);  // true → same instance
//     }
// }
