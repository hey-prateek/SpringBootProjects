package ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Person p) {
        return this.id - p.id;
    }
}

public class comparable {
    public static void main(String[] args) {
        List<Person> lst = Arrays.asList(new Person(2, "prateek"), new Person(1, "tiwari"));
        for (Person p : lst) {
            System.out.println(p.id + " " + p.name);
        }
        Collections.sort(lst);
        System.out.println("after sorting...");
        for (Person p : lst) {
            System.out.println(p.id + " " + p.name);
        }
    }
}
