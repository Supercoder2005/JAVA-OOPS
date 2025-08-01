import java.util.*;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> llist = new LinkedList();

        for(int i=0;i<=20;i++){
            llist.add(fib(i));
        }
        System.out.println("Linked List ");

        //change every even element to 0
        for(Integer x : llist){ // for each loop : for each element x in llist 
            System.out.println(x+" ");
            if(x%2==0){
                int temp = llist.indexOf(x);
                llist.set(temp,0);// here the set method has two parameters temp = index of elements , 0 = change each values of that index to 0
            }
        }

        // remove every alternate element to 0 
        boolean flag = false;
        for(Integer x : llist){
            if(x==0){
                if(flag){
                    int index = llist.indexOf(x);
                    llist.remove(index);
                }
                flag = !flag;
            }
        }
    }

    public static Integer fib(int n){
        if(n==1 || n==2){
            return (n-1);
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
