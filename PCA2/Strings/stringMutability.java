import java.util.*;
public class stringMutability {
    public static void main(String[] args) {
                                                                                                                                                                                 
        
        String s2 = s1; // both s1 & s2 refers to the same object
        s1 = s1+" World"; // here after modifying s1 it refers to a new object rather than changing the old s1

        System.out.println("s1 :"+" "+s1);
        System.out.println("s2 :"+" "+s2);
        if(s1 == s2){
            System.out.println("Mutable");
        }
        else{
            System.out.println("Immutable");
        }
        sc.close();
    }
}
