import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class methodReferenceForStaticMethod {
    public static void main(String[] args) {

        List<person> lst = new ArrayList<>();
        lst.add(new person("prateek", 25));
        lst.add(new person("punith", 27));
        lst.add(new person("osman", 28));

        // compare using method references first by name
        Collections.sort(lst, methodReferenceForStaticMethod::comparebyname);

        // print this first
        lst.stream().map(x -> x.getName()).forEach(System.out::println);

        // now using age
        Collections.sort(lst, methodReferenceForStaticMethod::comparebyage);

        // print this now
        lst.stream().map(x -> x.getAge()).forEach(System.out::println);

    }

    static int comparebyname(person a, person b) {
        return a.getName().compareTo(b.getName());
    }

    static int comparebyage(person a, person b) {
        return a.getAge().compareTo(b.getAge());
    }
}

class person {
    String name;
    Integer age;

    person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
