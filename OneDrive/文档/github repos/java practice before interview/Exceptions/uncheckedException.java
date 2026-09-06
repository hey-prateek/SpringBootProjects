package Exceptions;

public class uncheckedException {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index is out of bound...");
        }

    }

}
