/*
Dynamic Dispatch
 Problem Statement
 Complete the Java code that uses the concept of inheritance to demonstrate dynamic method
 dispatching.
 • Create a class Vehicle with the following members:– Private instance variable name.– Constructor to initialize name.– Accessor method for name.– Method display to display the text: ”This is a generic vehicle.”
 Classes Car and Bicycle should be defined in such a way that any object of Car or
 Bycycle can be assigned to a reference variable of type Vehicle. See the main method
 to understand the context.– For Car, the method display should print: ”This is a car named name.”– For Bicycle, the method display should print: ”This is a bicycle named name .”
 In the main method of the DispatchExample class, create an array of Vehicle objects with
 size 3.
 • Initialize the first element with a generic vehicle (you can use an empty string for its
 name).
 • Initialize the second and third elements with a Car and a Bicycle, respectively, by
 taking the vehicle’s name as input from the user.
 Iterate over the array and call the display method for each vehicle.
 */

import java.util.Scanner;
 class Vehicle {
    private String name;
    public Vehicle(String n) {
    name = n;
    }
    // Define method display
    public void display(){
        System.out.println("This is a generic vehicle.");
    }
    // Define an accessor method
    public String get_name(){
        return name;
    }
 }
 //Define class Car
 class Car extends Vehicle{
    public Car(String name){
        super(name);
    }
    public void display(){
        System.out.println("This is a car named "+super.get_name()+".");
    }
 }
 //Define class Bicycle
 class Bicycle extends Vehicle{
    public Bicycle(String name){
        super(name);
    }
    public void display(){
        System.out.println("This is a bicycle named "+super.get_name()+".");
    }
 }
 public class DispatchExample {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = new Vehicle("");
    vehicles[1] = new Car(sc.nextLine());
    vehicles[2] = new Bicycle(sc.nextLine());
    for (Vehicle v : vehicles) {
        v.display();
    }
    sc.close();
    }
 }