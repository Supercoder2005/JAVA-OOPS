import java.util.*;
// Interface
interface StackOperations{
    void push(int item);
    int pop();
    int peek();
    boolean isEmpty();
    void display();
}
// Abstract class
abstract class AbstractStack implements StackOperations{
    protected int[] stack;
    protected int top = -1;
    public AbstractStack(int size){
        stack = new int[size];
    }
}

// class to define all the stack operations
class MyStack extends AbstractStack {
    // constructor
    public MyStack(int size){
        super(size);
    }
    // push 
    public void push(int item){
        if(top == stack.length - 1)
            System.out.println("Overflow");
        else{
            top ++;
            stack[top] = item;
        }
    }
    // pop 
    public int pop(){
        if(top == -1) {
            System.out.println("Underflow");
            return -1;
        } 
        else {
            return stack[top--];
        }
    }
    // peek
    public int peek(){
        if(top == -1){
            System.out.println("Underflow");
            return -1;
        }
        else{
            return stack[top];
        }
    }
    // isEmpty
    public boolean isEmpty(){
        if(top == -1)
            return true;
        else
            return false;
    }
    // display
    public void display(){
        if(isEmpty())
            System.out.println("The stack is empty");
        else{
            for(int i=top;i>-1;i--){
                System.out.print("\t"+stack[i]);
            }
        }
        System.out.println();
    }
}

// Main class
public class StackMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stack size:");
        int size = sc.nextInt();

        MyStack s = new MyStack(size);

        do{
            System.out.println("1.Push 2.Pop 3.Peek 4.IsEmpty 5.Display 6.Exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter item : ");
                    int item = sc.nextInt();
                    s.push(item);
                    break;
                case 2:
                    System.out.println("Popped item is : "+s.pop());
                    break;
                case 3:
                    System.out.println("Top element of the stack : "+s.peek());
                    break;
                case 4:
                    System.out.println("Is the stack empty ? "+s.isEmpty());
                    break;
                case 5:
                    System.out.println("Stack elements ----");
                    s.display();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice !");
            }
        }while(true);
    }
}
