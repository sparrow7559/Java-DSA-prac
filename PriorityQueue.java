// import java.util.PriorityQueue;
import java.util.Queue;
public class PriorityQueue{
    public static void main(String[] args) {
        // prioity queue stores in heap in which the lowest goes in first
        Queue<Integer> pq = new java.util.PriorityQueue<>();
        // Queue<Integer> pq = new java.util.PriorityQueue<>(Comparator.reverseOrder());
        //Comparator.reverseOrder() can be used to reverse the prioity heap
        
        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }
}