import java.util.*;
public class printOnlyLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                System.out.println(c);
            }
        }
    }   
}
