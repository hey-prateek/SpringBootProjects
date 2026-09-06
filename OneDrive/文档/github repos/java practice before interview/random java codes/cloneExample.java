class Person implements Cloneable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override clone() and make it public
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls Object's protected clone()
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class cloneExample {
    public static void main(String[] args) {
        try {
            Person original = new Person("Alice", 25);
            Person cloned = (Person) original.clone(); // Works now!
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);

            cloned.name = "Bob";
            System.out.println("After modification:");
            System.out.println("Original: " + original);
            System.out.println("Cloned: " + cloned);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed: " + e.getMessage());
        }
    }
}