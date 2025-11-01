import java.util.*;
public class countWordsAndCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        s = s+" "; // to count the last word
        int wc = 0;
        int chc = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i); // extracting each characyer of the string
            if(c != ' '){
                chc ++;
            }
            if(c == ' '){
                wc ++;
            }
        }
        System.out.println("Total no of words :"+wc);
        System.out.println("Total no of characters :"+chc);
    }
}
