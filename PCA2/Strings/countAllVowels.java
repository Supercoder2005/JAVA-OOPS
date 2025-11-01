import java.util.*;
public class countAllVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();
        int count = 0;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            c = Character.toLowerCase(c);
            if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'){
                count++;
            }
        }
        System.out.println("Total no of vowels = "+count);
    }
}
