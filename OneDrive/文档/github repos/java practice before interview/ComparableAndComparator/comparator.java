package ComparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class comparingPerson implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

class Person {
    int id;
    String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class comparator {
    public static void main(String[] args) {
        List<Person> lst = Arrays.asList(new Person(3, "zinia"), new Person(2, "prateek"), new Person(1, "tiwari"));
        for (Person p : lst) {
            System.out.println(p.id + " " + p.name);
        }
        Collections.sort(lst, new comparingPerson());
        System.out.println("after sorting...");
        for (Person p : lst) {
            System.out.println(p.id + " " + p.name);
        }
    }
}
