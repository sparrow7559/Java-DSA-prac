// import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueue{
    public static void main(String[] args) {
        Queue<Integer> pq = new java.util.PriorityQueue<>();
        
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
    }
}