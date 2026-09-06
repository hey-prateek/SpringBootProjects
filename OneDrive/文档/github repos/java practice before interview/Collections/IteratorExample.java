package Collections;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Create iterator
        Iterator<String> iterator = list.iterator();

        System.out.println("Iterating through list:");
        while (iterator.hasNext()) {             // Check if next element exists
            String item = iterator.next();       // Get next element
            System.out.println(item);

            // Remove an element using iterator
            if (item.equals("Banana")) {
                iterator.remove();               // Safe removal
            }
        }

        System.out.println("\nAfter removal:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
