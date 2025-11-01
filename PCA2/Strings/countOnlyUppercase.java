import java.util.*;
public class countOnlyUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)){
                count ++;
            }
        }
        System.out.println("Total no. of uppercase letters in the string - "+s+" is : "+count);
    }
}
