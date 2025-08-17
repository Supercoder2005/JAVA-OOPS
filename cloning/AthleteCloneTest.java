import java.util.ArrayList;
import java.util.Scanner;

class Athlete implements Cloneable{
    String athleteChestNum;
    ArrayList<String> events = new ArrayList<String>();
    
    public Athlete(){
        athleteChestNum = "000";
        events.add("Relay");
        events.add("Ind Evt 1");
        events.add("Ind Evt 2");
    }
    // Add mutator methods for athleteChestNum, individual evt1, individual evt2
    public void setAthleteChestNum(String i){
        this.athleteChestNum=i;
    }
    
    public void setIndividualEvt1(String s){
        this.events.remove(1);
        this.events.add(1,s);
    }
    
    public void setIndividualEvt2(String s){
        this.events.remove(2);
        this.events.add(2,s);
    }
    // Implement method clone()
    public Athlete clone() throws CloneNotSupportedException{
        Athlete obj = (Athlete)super.clone();
        ArrayList<String> clonedEvents = new ArrayList<String>();
        clonedEvents.add(0,this.events.get(0));
        clonedEvents.add(0,this.events.get(1));
        clonedEvents.add(0,this.events.get(2));
        obj.events = clonedEvents;
        return obj;
    }
    
    public String toString(){
        return athleteChestNum+" "+events;
    }
}
public class AthleteCloneTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Athlete dummyAthlete = new Athlete();
        try{
            Athlete a1 = (Athlete)dummyAthlete.clone();
            a1.setAthleteChestNum(sc.next());
            a1.setIndividualEvt1(sc.next());
            a1.setIndividualEvt2(sc.next());
            
            Athlete a2 = (Athlete)a1.clone();
            a2.setAthleteChestNum(sc.next());
            a2.setIndividualEvt1(sc.next());
            a2.setIndividualEvt2(sc.next());
            
            System.out.println("a1 "+a1);
            System.out.println("a2 "+a2);
        }
        catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        sc.close();
    }
}
