/*
A laptop is both a computer and a portable device. Complete the java code in order to print the customized messages based on which among the two roles - computer or portable device - of a laptop is being given as input.
- Interface Computer has the abstract method compute()
- Interface PortableDevice has the abstract method batteryBalance()
- Class Laptop has properties of both a Computer and a PortableDevice and has the following members:
    - method compute() that returns the string: <Name of the device> computes 
      method batteryBalace() that returns the string: <Name of the device> is fully charged 
- Class InterfaceTest has the main method that has:
    - Accepts as input the types and names of 3 devices
    -  If the type in C, then invoke method compute(),else invoke meyhod batteryBalance()
    - Print the messages 

What you have to do :
- Define interface Computer 
- Define interface PortableDevice
- Define class Laptop
*/


// ****************** ABSTRACT CLASS ******************

import java.util.*;
// DEFINE INTERFACE COMPUTER
interface Computer{
    String compute();
}
// DEFINE INTERFACE PORTABLE DEVICE
interface PortableDevice{
    String batteryBalance();
}
//DEFINE CLASS LAPTOP
class Laptop implements Computer , PortableDevice{
    String name;
    public Laptop(String n){
        this.name = n;
    }
    public String compute(){
        return name + " computes";
    }
    public String batteryBalance(){
        return name + " is fully charged";
    }
}
public class InterfaceTest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> messagesList = new ArrayList<>();
        for(int i=0;i<3;i++){
            String type = sc.next();
            if(type.equals("C")){
                Computer c = new Laptop(sc.next());
                messagesList.add(c.compute());
            }
            else if(type.equals("M")){
                PortableDevice m = new Laptop(sc.next());
                messagesList.add(m.batteryBalance());
            }
        }
        for(String s:messagesList){
            System.out.println(s);
        }
        sc.close();
    }
}
