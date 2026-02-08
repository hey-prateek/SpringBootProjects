import java.util.*;
// import java.util.function.Function;
import java.util.function.Consumer;
// import java.util.stream.Collectors;
import java.util.concurrent.atomic.AtomicInteger;

public class code10_printShoppingList {
    public static void main(String[] args) {
       
       List<String> slist=new ArrayList<>(Arrays.asList("eggs", "milk", "soy", "protein bars"));
       
       AtomicInteger i=new AtomicInteger();
       
       Consumer<String> c=s -> System.out.println(i.getAndIncrement()+" "+s);
       
       slist.forEach(s -> c.accept(s));
    }
}