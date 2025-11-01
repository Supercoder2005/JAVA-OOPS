import java.util.*;
public class frequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        // convert the string to lower case
        s = s.toLowerCase();
        // convert the string into a character array
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count = 1; // count for each character
            // skip white spaces and already counted characters
            if(ch[i]==' '||ch[i]=='0'){
                continue;
            }
            // inner loop to check duplicates
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='0'; // mark the character as counted
                }
            }
            System.out.println(ch[i]+" "+count);
        }
    }    
}
