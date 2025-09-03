import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparator_Interface {

    public static void main(String[] args) {
        
        // comparator interface syntax ->compare(T o1, T o2)
        List<Student> lst=new ArrayList<>();
        lst.add(new Student("Prateek", 25));
        lst.add(new Student("Muskan", 24));
        lst.add(new Student("Ankit", 30));
        lst.add(new Student("Prateek_2", 30));

        // using comparator
        lst.sort(Comparator.comparingInt((Student s)->s.age));

        // if want in reverse ordre
        lst.sort(Comparator.comparingInt((Student s)->s.age).reversed());

        // creating a custom Comparaator object
        Comparator<Student> comp=new Comparator<Student>() {
            public int compare(Student s1, Student s2)
            {
                return s1.name.compareTo(s2.name);
            }
        };

        // sorting list based on names
        lst.sort(comp);

        // printing Student objects using forEcah loop and toString() method
        for(Student s:lst)
        {
            System.out.println(s.toString());
        }



    }
    
}

class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.age=age;
        this.name=name;
    }

    //  toString() method to return object in string format
    public String toString()
        {
            return name+" "+age;
        }
}
