package Collections;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        ListIterator<String> listIterator = fruits.listIterator();

        System.out.println("Forward iteration:");
        while (listIterator.hasNext()) {
            String fruit = listIterator.next();
            System.out.println(fruit);

            // Modify elements
            if (fruit.equals("Banana")) {
                listIterator.set("Blueberry");   // Replace current element
            }

            // Add new element after specific value
            if (fruit.equals("Cherry")) {
                listIterator.add("Date");        // Add new element after Cherry
            }
        }

        System.out.println("\nBackward iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        System.out.println("\nFinal List:");
        for (String f : fruits) {
            System.out.println(f);
        }
    }
}
