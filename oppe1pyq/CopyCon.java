/*
 * Write a Java code as instructed. [Copy Constructor]
 * Define class Employee that has the following members.
 - String name, double salary as private instance variables.
 - Constructor to initialize the instance variables.
 - Overload constructor public Employee(Employee e), such that it initialize variables name and salary using parameter e 
 - Override  method toString() that returns the name and salary of the Employee as a single concatenated string 
 
 * Define class CopyCon that has the main method.
 - Create an object e1 of Employee.
 - Create one more object e2 of Employee by passing e1 as parameter to the overload constructor
 - Display e1 and e2
*/

class Employee{
    private String name;
    private double salary;
    //Constructor to initialize the instance variables.
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    //Overload constructor public Employee(Employee e), such that it initialize variables name and salary using parameter e 
    public Employee(Employee e){
        this.name = e.name;
        this.salary = e.salary;
    }
    //Override  method toString() that returns the name and salary of the Employee as a single concatenated string 
    public String toString(){
        return name+" "+salary;
    }
    
}

//Define class CopyCon that has the main method.
public class CopyCon {
    public static void main(String args[]){
        //Create an object e1 of Employee.
        Employee e1 = new Employee("Srinjinee Mitra",50000);
        //Create one more object e2 of Employee by passing e1 as parameter to the overload constructor
        Employee e2 = new Employee(e1);
        //Display e1 and e2
        System.out.println(e1);
        System.out.println(e2);
    }
}
