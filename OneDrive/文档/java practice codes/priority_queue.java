import java.util.PriorityQueue;

public class priority_queue {

    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);

        System.out.println(pq.poll());

        // inserts elements  in smallest first fashion
        // uses concept of heap or min-heap
        while(!pq.isEmpty())
        {
            System.out.println(pq.poll());
        }
    }
    
}
