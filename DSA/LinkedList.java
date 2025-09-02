import java.util.*;

class Node{
    int data;
    Node next;
}
class Operations{
    Node createLinkedList(Node Start){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data or press -1 to exit:");
        int data1 = sc.nextInt();
        while(data1 != -1){
            Node newnode = new Node();
            newnode.data = data1;
            newnode.next = null;
            if(Start == null){
                Start = newnode;
            }
            else{
                // by default create a node after a node 
                Node temp = Start;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newnode;
                temp = newnode;
            }
            System.out.println("Enter data or press -1 to exit:");
            data1 = sc.nextInt();
        }
        return Start;
    }

    void display(Node Start){
        Node temp = Start;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    Node insertAtBeginning(Node Start){
        Node newnode  = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data :");
        int data1 = sc.nextInt();
        newnode.data = data1;
        newnode.next = null;

        newnode.next = Start;
        Start = newnode;

        return Start;
    }

    Node addBefore(Node Start){
        Node newnode = new Node();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter data :");
        int data1 = sc.nextInt();
        newnode.data = data1;
        newnode.next = null;

        newnode.next = Start;
        Start = newnode;

        return Start;
    }

    Node insertAtEnd(Node Start){
        Node newnode = new Node();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data :");
        int data1 = sc.nextInt();
        newnode.data = data1;
        newnode.next = null;

        Node temp = Start;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        return Start;
    }
}


public class LinkedList {
    public static void main(String[] args) {
    
        Operations ob = new Operations();
        Node Start = null;
        
        System.out.println("\n--- Linked List Menu ---");
        System.out.println("1. Create (Add Node at End)");
        System.out.println("2. Display");
        System.out.println("3. Insert at Beginning");
        System.out.println("4. Insert at End");
        System.out.println("5. Add Before a Node");
        System.out.println("6. Exit");

        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter your choice:");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    Start = ob.createLinkedList(Start);
                    break;
                case 2:
                    ob.display(Start);
                    break;
                case 3:
                    Start = ob.insertAtBeginning(Start);
                    break;
                case 4:
                    Start = ob.insertAtEnd(Start);
                    break;
                case 5:
                    Start = ob.addBefore(Start);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
            }
        }while(true);
    }
}
