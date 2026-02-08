package Exceptions;

public class error {
    public static void main(String[] args) {
        try {
            recr();
        } catch (StackOverflowError e) {
            System.out.println("stack overflow error...");
        }
    }

    static void recr() {
        recr();
    }

}
