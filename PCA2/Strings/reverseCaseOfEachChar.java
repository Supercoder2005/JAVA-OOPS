import java.util.*;
public class reverseCaseOfEachChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                c=Character.toLowerCase(c);
                System.out.print(c);
            }
            else{
                c=Character.toUpperCase(c);
                System.out.print(c);
            }
        }
    }
}
