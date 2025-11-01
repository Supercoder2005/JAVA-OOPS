import java.util.*;
public class createNewStrWithDigitFirstThenChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        String d = "";
        String r = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                d=d+c;
            }
            else{
                r=r+c;
            }
        }
        String f = d+r;
        System.out.println("Creating the new string with digit first then characters : "+f);
    }
}
