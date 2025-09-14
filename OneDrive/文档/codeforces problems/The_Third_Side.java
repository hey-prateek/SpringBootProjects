import java.util.*;

public class The_Third_Side {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        StringBuilder r = new StringBuilder();
        while (t-- > 0) {
            int n = s.nextInt();
            PriorityQueue<Integer> h = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < n; i++) h.add(s.nextInt());
            while (h.size() > 1) h.add(h.poll() + h.poll() - 1);
            r.append(h.poll()).append("\n");
        }
        System.out.print(r);
        s.close();
    }
}
