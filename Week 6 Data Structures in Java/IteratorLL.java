import java.util.*;

public class IteratorLL {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList();
        for(int i=0;i<=20;i++){
            llist.add(fib(i));
        }
        Iterator<Integer> itr = llist.listIterator();
        boolean flag2 = false;
        while(itr.hasNext()){
            int val = itr.next();
            if (val == 0){
                if(flag2){
                    itr.remove(); // remove method removes the element given by the next method
                }
                flag2 = !flag2;
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
