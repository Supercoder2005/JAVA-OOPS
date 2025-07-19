/*
Complete the java code that uses the concept of inheritance to demonstrate dynamic method dispatching.
* Class Airplane has the following members:
- Private instance variable model
- Constructor to initialize model 
- Accessor method for model 
- Method display to display the text : Inside an anonymous airplane 
Classes Boeing and Airbus should be defined in such a way that any object of Boeing or Airbus can be assigned to a reference variable of type Airplane.
See the main method to understand the context.
* For an object of Boeing, method display should print the message Inside Boeing followed by the model of the Boeing.
* For an object of Airbus, method display should print the message Inside Airbus followed by the model of the Airbus.

What you have to do :
- Define an accessor method for model inside class Airplane 
- Define method display inside class Airplane 
- Define classes Boeing and Airbus 
*/

// ****************** Dynamic Dispatching ******************

import java.util.*;
class AirPlane{
    private String model;
    public AirPlane(String n){
        model = n;
    }
    // Define method display 
    public void display(){
        System.out.println("Inside an anonymous airplane");
    }
    // Define an accessor method for model 
    public String get_model(){
        return model;
    }
}

// Define class Boeing 
class Boeing extends AirPlane{
    public Boeing(String model){
        super(model);
    }
    public void display(){
        System.out.println("Inside Boeing "+ get_model());
    }
}
// Define class Airbus
class Airbus extends AirPlane{
    public Airbus(String model){
        super(model);
    }
    public void display(){
        System.out.println("Inside Airbus "+ get_model());
    }
}

public class DispatchPlaneEx{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        AirPlane[] aPlanes = new AirPlane[3];
        aPlanes[0] = new AirPlane("");
        aPlanes[1] = new Boeing(sc.nextLine());
        aPlanes[2] = new Airbus(sc.nextLine());

        aPlanes[0].display();
        aPlanes[1].display();
        aPlanes[2].display();
        sc.close();
    }
}