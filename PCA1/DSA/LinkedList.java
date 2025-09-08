import java.util.*;

class Node{
    int data;
    Node next;
}

class LLOperations{

    // method to create a new node 
    Node CreateLinkedlist(Node Start){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data otherwise enter -1 to exit:");
        int data1 = sc.nextInt();
        
        while(data1 != -1){
            Node newnode = new Node();
            newnode.data = data1;
            newnode.next = null;
            if(Start == null){
                Start = newnode;
            }
            else{
                // by default add a newnode after the present node 
                Node temp = Start;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newnode;
                temp = newnode;
            }
            System.out.println("Enter data otherwise enter -1 to exit:");
            data1 = sc.nextInt();
        }
        return Start;
    }

    // insert at beginning
    Node insertAtBeginning(Node Start){
        System.out.println("Enter data:");
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();

        Node newnode = new Node();
        newnode.data = data1;
        newnode.next = null;

        newnode.next = Start;
        Start = newnode;
        return Start;
    }

    // insert at end
    Node insertAtEnd(Node Start){
        System.out.println("Enter data :");
        Scanner sc = new Scanner(System.in);
        int data1 = sc.nextInt();

        Node newnode = new Node();
        newnode.data = data1;
        newnode.next = null;

        Node temp = Start;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode = temp;
        return Start;
    }

    // display the LL 
    void display(Node Start){
        Node temp = Start;
        while(temp != null){
            System.out.print("\t"+temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}

// main class
public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LLOperations ob = new LLOperations();
        Node Start = null;
        System.out.println("----Linked List Operations----");
        System.out.println("1. Create 2. Display 3.Insert at beginning 4. Insert at end 5. Exit");
        do{
            System.out.println("Enter your choice :");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    Start = ob.CreateLinkedlist(Start);
                    break;
                case 2:
                    System.out.println("Linked list elements -----");
                    ob.display(Start);
                    break;
                case 3:
                    Start = ob.insertAtBeginning(Start);
                    break;
                case 4:
                    Start = ob.insertAtEnd(Start);
                    break;
                case 5:
                    System.out.println("Exiting ...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }while(true);
    }
}
