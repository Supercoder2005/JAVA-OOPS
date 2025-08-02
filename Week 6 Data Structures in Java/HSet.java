import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class HSet {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet();
        Set<Integer> s2 = new HashSet(Arrays.asList(50,51,52,53,54,55));

        // HashSet removes duplicate and add elements in to the set randomly , not maintaining the order of putting the inputs 
        s1.add(99);s1.add(80);s1.add(99);
        s1.add(67); s1.add(33);

        System.out.println(s1);

        // contains method checks whether an element is present in the set or not
        System.out.println(s1.contains(10));
        
    }
}
