import java.util.*;

// Generic class with type parameter <T>
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class generics {

    // Generic method (works with any type)
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Bounded generic method (only accepts subclasses of Number)
    public static <T extends Number> double sumNumbers(List<T> numbers) {
        double sum = 0;
        for (T num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        // Using generic class
        Box<Integer> intBox = new Box<>();
        intBox.setValue(42);
        System.out.println("Box contains: " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("Hello Generics");
        System.out.println("Box contains: " + strBox.getValue());

        // Using generic method
        Integer[] intArr = {1, 2, 3, 4, 5};
        String[] strArr = {"A", "B", "C"};

        System.out.print("Integer array: ");
        printArray(intArr);

        System.out.print("String array: ");
        printArray(strArr);

        // Using bounded generic method
        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.0);

        System.out.println("Sum of Integer list = " + sumNumbers(intList));
        System.out.println("Sum of Double list = " + sumNumbers(doubleList));
    }
}
