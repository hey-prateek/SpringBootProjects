import java.util.*;
import java.util.function.Consumer;

class Cart {
    int id;
    String name;
    int price;
    String available; // "yes" or "no"

    public Cart(int id, String name, int price, String available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getAvailable() {
        return available;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", available='" + available + '\'' +
                '}';
    }
}

public class code14_printShoppingCartConsumer {

    public static void main(String[] args) {

        List<Cart> cartItems = new ArrayList<>(Arrays.asList(
                new Cart(1, "Laptop", 50000, "yes"),
                new Cart(2, "Mouse", 700, "yes"),
                new Cart(3, "Keyboard", 1500, "no"),
                new Cart(4, "Headphones", 2500, "yes"),
                new Cart(5, "Webcam", 3000, "no")
        ));

        // 1️⃣ Print all cart items
        Consumer<List<Cart>> printCart = items -> {
            System.out.println("Cart Items:");
            items.forEach(System.out::println);
        };

        // 2️⃣ Remove unavailable items
        Consumer<List<Cart>> removeUnavailable = items -> {
            items.removeIf(item -> !"yes".equalsIgnoreCase(item.getAvailable()));
            System.out.println("\nUnavailable items removed.");
        };

        // 3️⃣ Print total bill
        Consumer<List<Cart>> printTotalBill = items -> {
            int total = items.stream().mapToInt(Cart::getPrice).sum();
            System.out.println("\nTotal Bill: ₹" + total);
        };

        // Chain Consumers
        Consumer<List<Cart>> checkoutProcess = printCart
                .andThen(removeUnavailable)
                .andThen(printCart)
                .andThen(printTotalBill);

        // Execute
        checkoutProcess.accept(cartItems);
    }
}
