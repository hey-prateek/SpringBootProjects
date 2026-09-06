import java.io.*;

class user implements Serializable {
    private String name;
    private transient int id;

    user(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}

public class transientExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        user u = new user("prateek", 586);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"));
        System.out.println("before serializing: " + u.getName() + " " + u.getId());
        out.writeObject(u);

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.txt"));
        user r = (user) in.readObject();
        System.out.println("before serializing: " + r.getName() + " " + r.getId());

    }
}