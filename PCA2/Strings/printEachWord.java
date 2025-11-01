import java.util.*;
public class printEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String s = sc.nextLine();
        String w = "";
        s = s+" ";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c != ' '){
                w = w+c;
            }
            else{
                System.out.println(w);
                w="";
            }
        }
    }
}
