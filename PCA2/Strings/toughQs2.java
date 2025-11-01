// We take characters from s1 where the corresponding character in s2 is uppercase.
//Then, if one string is longer, we add the remaining characters from that string to the result.

import java.util.*;
public class toughQs2{
    static String method(String s1,String s2){
        int length1 = s1.length();
        int length2 = s2.length();
        int minlength = Math.min(length1,length2);
        String str = "";
        // check for each uppercase letter in s2
        for(int i=0;i<minlength;i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(Character.isUpperCase(c2)){
                str = str+c1;
            }
        }
        // add remaining characters from the longer string 
        if(length1>length2){
            str = str + s1.substring(minlength);
        }
        else if(length2>length1){
            str = str + s2.substring(minlength);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();
        System.out.println(method(s1,s2));

    }
}