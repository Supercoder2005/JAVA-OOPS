import java.util.*;
public class replaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the character to be replaced:");
        char oldchar = sc.next().charAt(0);
        System.out.println("Enter the new character:");
        char newchar = sc.next().charAt(0);
        String replacedString = s.replace(oldchar,newchar);
        System.out.println("The string after character replacement :"+replacedString);
    }
}
