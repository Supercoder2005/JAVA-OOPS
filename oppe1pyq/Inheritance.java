/* 
Write Java code as instructed.[Overloading vs Overriding].
* Define class employee that has the following members:
- string name, double salary as private instance vaiables
- Constructor to initialize the instance variables
- Define method print() to display name and salary of an Employee.
- Overload method print() as print(float percent) to display the name,salary and bonus of an Employee.
- Method public double bonus(float percent) that returns the bonus computed as (percent/100.0)*salary.

* Define class Manager that extends class Employee and has the following members:
- String secretary as private instance variable.
- Define a constructor to initialize the instance variable of Manager that includes the instance variables of Employee.
- Override method print() to display the name, salary, secretary and bonus of a Manager.
- Override method print(float percent) to display name, salary, secretary and bonus of a Manager.
- Override public double bonus(float percent) that returns the bonus of a Manager as 50 percent extra bonus than a regular Employee.

* Define class Inheritance that has the main method.
- Here take two reference variables obj1, obj2 of an Employee .
- Initialize obj1 with Employee class object.
- Initialize obj2 with Manager class object.
- call print() and print(float percent) methods using both obj1 and obj2.
*/

class Employee{
    private String name;
    private double salary;
    //Constructor to initialize the instance variables
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public String get_name(){
        return name;
    }
    public double get_salary(){
        return salary;
    }
    //Define method print() to display name and salary of an Employee.
    public void print(){
        System.out.println("Employee name :"+name+" "+"Employee salary :"+salary);
    }
    //Overload method print() as print(float percent) to display the name,salary and bonus of an Employee.
    public void print(float percent){
        System.out.println("Employee name :"+name+" "+"Employee salary :"+salary+"Employee bonus :"+" "+bonus(percent));
    }
    //Method public double bonus(float percent) that returns the bonus computed as (percent/100.0)*salary.
    public double bonus(float percent){
        return (percent/100.0)*salary;
    }
}

// Define class Manager that extends class Employee
class Manager extends Employee{
    private String secretary;
    //Define a constructor to initialize the instance variable of Manager that includes the instance variables of Employee
    public Manager(String name, double salary, String secretary){
        super(name,salary);
        this.secretary = secretary;
    }
    //Override method print() to display the name, salary, secretary and bonus of a Manager.
    public void print(){
        System.out.println(super.get_name()+" "+super.get_salary()+" "+secretary);;
    }
    //Override method print(float percent) to display name, salary, secretary and bonus of a Manager.
    public void print(float percent){
        System.out.println(get_name() +" "+ get_salary() +" "+ secretary +" "+ bonus(percent));
    }
    //Override public double bonus(float percent) that returns the bonus of a Manager as 50 percent extra bonus than a regular Employee.
    public double bonus(float percent){
        return (super.bonus(percent)+(super.bonus(percent))*0.5);
    }
}

//Define class Inheritance that has the main method.
class Inheritance{
    public static void main(String args[]){
        Employee obj1 = new Employee("Srinjinee Mitra",90000);
        Employee obj2 = new Manager("Amitava Datta",250000,"Pranay De");
        obj1.print();
        obj2.print();
        float percent = 10f;
        obj1.print(percent);
        obj2.print(percent);
    }
}