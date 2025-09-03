import java.util.List;
import java.util.ArrayList;
// class a
// {
//     int a;
// }
// class b extends a
// {
//     int b;
// }
class tempp<T>
{
	void add(T t)
	{
		System.out.println("hi");
	}
}
public class temp
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		tempp<Number> t=new tempp<>();
        t.add(10);
        t.add(10.30);

	}
}