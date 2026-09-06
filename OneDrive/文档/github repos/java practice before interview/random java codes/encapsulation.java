class Person {
    private int id;
    private String name;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Person p = new Person(586, "Prateek");
        System.out.println(p.getId() + " " + p.getName());
        p.setId(590);
        System.out.println(p.getId() + " " + p.getName());

    }
}
