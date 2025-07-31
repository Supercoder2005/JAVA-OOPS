import java.util.*;

class Employee{
    private int id;
    private String name;
    public Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "id = "+id+" name = "+name;
    }
}


class LinkedList<T>{

    private Node head;
    public LinkedList(){
        head = null;
    }
    public void insertAtBeginning(T data){
        Node nd = new Node(data);
        if(head == null){
            head = nd;
        }
        else{
            nd.next = head;
            head = nd;
        }
    }

    public void deleteFromFirst(){
        if(head == null){
            System.out.println("Empty");
        }
        else{
            head = head.next;
        }
    }

    public void print(){
        if(head == null){
            System.out.println("Empty");
        }
        else{
            for(Node nd = head; nd != null; nd = nd.next){
                System.out.println(nd.data +" ");
            }
        }
    }

    private class Node{
        private T data;
        private Node next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }
}

public class genericLinkedList {
    public static void main(String[] args) {
        LinkedList<Employee> il = new LinkedList<Employee>();
        System.out.println("1->Insert ; 2->Remove ; 3->Print ; 4->Exit");
        Scanner sc = new Scanner(System.in);
        for(;;){//while(true)
            int n = sc.nextInt();
            switch(n){
                case 1:
                    int id = sc.nextInt();
                    String name = sc.next();
                    Employee e = new Employee(id,name);
                    il.insertAtBeginning(e);
                    sc.close();
                    break;
                case 2:
                    il.deleteFromFirst();
                    break;
                case 3:
                    il.print();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid input");
            }
            

        }

    }
}
