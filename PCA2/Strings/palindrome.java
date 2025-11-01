import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        String rev = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            rev = c+rev;
        }
        System.out.println(s);
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
