import java.io.*;

class User implements Serializable {
    String name;
    transient String password; // will not be serialized

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}

public class transientExample {
    public static void main(String[] args) throws Exception {
        User user = new User("Alice", "secret123");

        // Serialize
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
        out.writeObject(user);
        out.close();

        // Deserialize
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
        User deserialized = (User) in.readObject();
        in.close();

        System.out.println("Name: " + deserialized.name); // Alice
        System.out.println("Password: " + deserialized.password); // null (not saved)
    }
}
