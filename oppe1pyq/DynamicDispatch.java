import java.util.*;
class WaterBody{
    private String name;
    public WaterBody(String n) {
        name = n;
    }
    // Define method display
    public void display(){
        System.out.println("Inside an anonymous body of water");
    }
    // Define an accessor method
    public String get_name(){
        return name;
    }
}
class River extends WaterBody{
    public River(String name){
        super(name);
    }
    public void display(){
        System.out.println("Inside river "+super.get_name());
    }
}
class Lake extends WaterBody{
    public Lake(String name){
        super(name);
    }
    public void display(){
        System.out.println("Inside lake "+super.get_name());
    }
}

public class DynamicDispatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        WaterBody[]wBodies =new WaterBody[3];
        wBodies[0]= new WaterBody("");
        wBodies[1]= new River(sc.nextLine());
        wBodies[2]= new Lake(sc.nextLine());
        wBodies[0].display();
        wBodies[1].display();
        wBodies[2].display();
        sc.close();
    }
}
