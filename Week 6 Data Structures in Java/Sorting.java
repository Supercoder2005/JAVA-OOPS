import java.util.Collections;
import java.util.ArrayList;

class Fighter implements Comparable<Fighter>{
    String name;
    int wins;

    public Fighter(String name,int wins){
        this.name = name;
        this.wins = wins;
    }
    public int compareTo(Fighter obj){ // if this.obj < parameter.obj : returns -ve value 
        return (obj.wins - this.wins); // if this.obj > parameter.obj : returns +ve value 
    }                                  // if this.obj < parameter.obj : returns 0 value 
    public String toString(){
        return "\n name: "+name+" , wins: "+wins;
    }
}


class Sorting{
    public static void main(String[] args) {
        ArrayList<Fighter> fighters = new ArrayList();
        fighters.add(new Fighter("John",28));
        fighters.add(new Fighter("Khabib",29));
        fighters.add(new Fighter("Daniel",22));
        fighters.add(new Fighter("Demetrious",27));
        System.out.println(fighters);

        Collections.sort(fighters); // Collections is a public class & Collection is a interface in java
        System.out.println(fighters);

    }
}