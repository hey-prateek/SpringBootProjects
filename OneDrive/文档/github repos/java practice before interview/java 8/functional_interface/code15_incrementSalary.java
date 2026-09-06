import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Consumer;

class Employee
{
    String name;
    int salary;
    Employee(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }
}
public class code15_incrementSalary
{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
List<Employee> lemp=new ArrayList<>(Arrays.asList(new Employee("prateek", 80000), new Employee("punith", 60000), new Employee("nayab", 25000)));

Consumer<Employee> cons1=s -> {
    if(s.salary < 50000)
    {
        s.salary=s.salary+(s.salary/10);
    }
};

Consumer<Employee> cons2=s-> {
    System.out.println(s.name+" "+s.salary);
};

Consumer<Employee> cons3=cons1.andThen(cons2);

lemp.forEach(cons3);


	}
}
