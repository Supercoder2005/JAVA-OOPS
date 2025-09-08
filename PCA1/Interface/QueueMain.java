import java.util.*;
// Interface 
interface QueueOperations{
    void enqueue(int item);
    int dequeue();
    int peek();
    boolean isEmpty();
    void display();
}

// Abstract class 
abstract class AbstractQueue implements QueueOperations{
    protected int front = -1;
    protected int rear = -1;
    protected int[] queue;
    public AbstractQueue(int size){
        queue = new int[size];
    }
}

// class to define all queue operations
class MyQueue extends AbstractQueue{
    public MyQueue(int size){
        super(size);
    }
    // enqueue
    public void enqueue(int item){
        if(rear == queue.length - 1){
            System.out.println("Overflow !");
        }
        else{
            if(front == -1){
                front = 0; // first insertion
            }
            rear ++;
            queue[rear] = item;
        }
    }
    // dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Underflow !");
            return -1;
        }
        else{
            return queue[front ++];
        }
    }
    // peek 
    public int peek(){
        if(isEmpty()){
            System.out.println("Underflow !");
            return -1;
        }
        else{
            return queue[front];
        }
    }
    // isEmpty
    public boolean isEmpty(){
        if(front == -1 || front > rear){
            return true;
        }
        else{
            return false;
        }
    }
    // display
    public void display(){
        if(isEmpty()){
            System.out.println("Underflow !");
        }
        else{
            for(int i=front ; i<=rear ; i++){
                System.out.print("\t"+queue[i]);
            }
        }
        System.out.println();
    }
}

// main class 
public class QueueMain{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the queue size :");
        int size = sc.nextInt();

        MyQueue q = new MyQueue(size);
        System.out.println("----Queue Operations----");
        System.out.println("1. Enqueue 2. Dequeue 3.Peek 4.IsEmpty 5. Display 6. Exit");
        do{
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter item :");
                    int item = sc.nextInt();
                    q.enqueue(item);
                    break;
                case 2:
                    System.out.println("Dequeued item :"+q.dequeue());
                    break;
                case 3:
                    System.out.println("First element of the queue :"+q.peek());
                    break;
                case 4:
                    System.out.println("Is the queue empty ?"+q.isEmpty());
                    break;
                case 5:
                    System.out.println("The queue elements -----");
                    q.display();
                    break;
                case 6:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invalid choice !");
                    break;
            }
        }while(true);
    }
}
