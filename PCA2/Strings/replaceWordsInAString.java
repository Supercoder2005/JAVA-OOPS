import java.util.*;
public class replaceWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        System.out.println("Enter the word to be replaced:");
        String oldword = sc.nextLine();
        System.out.println("Enter the new word:");
        String newword = sc.nextLine();
        String replacedString = s.replace(oldword,newword);
        System.out.println("The string after word replacement :"+replacedString);
    }
}
