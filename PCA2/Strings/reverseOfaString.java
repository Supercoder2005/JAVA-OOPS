import java.util.Scanner;
public class reverseOfaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        String rev ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            rev = c+rev;
        }
        System.out.println("Reverse of the string :"+rev);
    }
}
