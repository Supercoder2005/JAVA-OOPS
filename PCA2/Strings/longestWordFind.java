import java.util.*;
public class longestWordFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        // splitting out the words from the sentence based on the spaces
        String[] words = s.split(" ");
        // assume the first word as longest
        String longest = words[0];
        // itering through the words array to find out the longest one
        for(int i=0;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest = words[i];
            }
        }
        System.out.println("The longest word is :"+longest);
    }
}
