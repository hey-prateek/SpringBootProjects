import java.util.*;
import java.util.function.Consumer;
import java.time.LocalTime;
import java.io.FileWriter;
import java.io.IOException;

class order
{
    int id;
    String item;
    double price;
    
    order(int id, String item, double price)
    {
        this.id=id;
        this.item=item;
        this.price=price;
    }
    
    int getId()
    {
        return this.id;
    }
    String getItem()
    {
        return this.item;
    }
    double getPrice()
    {
        return this.price;
    }
    
    public String toString()
    {
        return "id: "+this.id+" item: "+this.item+" price: "+this.price;
    }
}

public class code13_OrderProcessingPipeline {

    public static void main(String[] args) {

        List<order> olist=new ArrayList<>(Arrays.asList(new order(1, "bat", 2000), new order(2, "ball", 150), new order(3, "wickets", 1500)));
        
        // System.out.print(olist.get(0).toString());
        
        Consumer<order> cons1 = s -> System.out.println(s.toString());
        
        Consumer<order> cons2 = s -> {
            if(s.getPrice()>1000)
            System.out.println("discount applied");
        };
        
        Consumer<order> cons3 = s -> System.out.println("order confirmed for item: "+s.getId());
        
        olist.forEach(cons1.andThen(cons2).andThen(cons3));
    }
}
