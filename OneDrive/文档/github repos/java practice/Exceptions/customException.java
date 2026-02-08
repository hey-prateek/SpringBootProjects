package Exceptions;

class customExceptionClass extends Exception {
    void customExceptionMethod() {
        System.out.println("inside custom exception...");
    }
}

public class customException {
    public static void main(String[] args) {
        try {
            method(10);
        } catch (customExceptionClass e) {
            e.customExceptionMethod();
        }
    }

    static void method(int num) throws customExceptionClass {
        if (num == 10)
            throw new customExceptionClass();
    }

}
