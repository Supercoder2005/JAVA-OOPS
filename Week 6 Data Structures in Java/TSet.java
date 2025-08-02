import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.HashSet;

public class TSet {
    public static void main(String[] args) {
        Set<Integer> ts2 = new TreeSet(Arrays.asList(50,51,52,53,54,55));
        System.out.println(ts2);
        // TreeSet removes duplicate and add elements in to the set in sorted order 
        ts2.add(99);ts2.add(80);ts2.add(99);
        ts2.add(67); ts2.add(33);

        System.out.println(ts2);
    }
}
