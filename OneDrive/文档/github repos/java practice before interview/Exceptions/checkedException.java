package Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class checkedException {
    public static void main(String[] args) {
        try {
            FileReader fread = new FileReader("temp.txt");
        } catch (IOException e) {
            System.out.println("file not found...");
            e.printStackTrace();
        }
    }

}
