import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class code11_executor {
    public static void main(String[] args)
    {
        Executor ex=Executors.newSingleThreadExecutor();
        ex.execute(()->System.out.println("inside executor method..."));
    }
}
