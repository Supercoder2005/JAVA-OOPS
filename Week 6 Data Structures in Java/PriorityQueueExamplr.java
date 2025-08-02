
import java.util.PriorityQueue;

// Priority Queue : stores data in Heap
public class PriorityQueueExamplr {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue();

        // while storing integer values , priority queue considers the integer with numeric value  having the highest priority 
        // this it will store them in ascending order 
        pq.add(33); pq.add(22); pq.add(55); pq.add(88);
        System.out.println(pq); // 22,33,55,88 

        System.out.println(pq.peek()); // give us the element present at the front 

        // poll() will return the smallest element present in the priority queue , i.e. the highest priority element will be deleted first
        System.out.println(pq.poll());
        pq.poll();
        System.out.println(pq);

    }
}
