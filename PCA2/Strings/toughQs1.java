import java.util.*;
public class toughQs1 {
    static boolean canForm(String s1,String s2){
        String temp = s1; // storing the first string 
        // traverse each characters of the second string
        for(int i=0;i<s2.length();i++){
            char c = s2.charAt(i);
            // find the position of the character in the second string
            int index = temp.indexOf(c);
            // if the character is not found in str1 then return false
            if(index == -1){
                return false;
            }
            else{
                String prev = temp.substring(0,index);
                String post = temp.substring(index+1);
                temp = prev+post;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string :");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string :");
        String s2 = sc.nextLine();
        System.out.println("Can we form the second string using the first one ?"+canForm(s1, s2));
    }
}
