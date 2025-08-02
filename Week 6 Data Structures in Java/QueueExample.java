import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList();
        q.add(80); // throw exception if the queue is full and you want to add a new element 
        q.add(90);
        q.add(123);
        q.add(34);
        System.out.println(q);

        q.offer(67); // offer method doesn't throw any exception error evenif the queue is full; it will not add new element , but code will not stop generating error
        System.out.println(q);

        System.out.println(q.peek()); // peek method will return the front element of the queue

        q.poll(); // it has the same work like offer method , that is it doesn't generate any error while removing element from the front evenif the list is empty 
        System.out.println(q);
        q.remove(); // remove the first element from the queue , throw error if the list is already empty
        System.out.println(q);

    }
}
