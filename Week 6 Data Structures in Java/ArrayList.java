import java.util.*;

public class ArrayList {
    public static void main(String args[]){
        List<Integer> alist = new ArrayList();

        for(int i=1;i<=10;i++){
            alist.add(fib(i));
        }
        for(int i=0;i<alist.size();i++){
            System.out.println(alist.get(i)+" ");
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
