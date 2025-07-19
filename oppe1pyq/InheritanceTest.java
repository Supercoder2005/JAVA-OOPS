/*
 * Write a java code as instructed . [Inheritance, Dynamic Dispatch]
 * Define class Employee that has the following members :
 - String name,double salary as private instance variables 
 - Mutator methods to update the instance variables of an Employee
 - Accessor methods to access the instance variables of an Employee
 - Method public double bonus(float percent) that returns the bonus computed as (percent/100.0)*salary 

 * Define class Manager that extends class Employee and has the following members:
 - String secretary as private instance variable
 - Mutator method to update the instance variable
 - Accessor method to access the instance variable 
 - Override public double bonus(float percent) that returns the bonus of a Manager as 50 percent extra bonus than a regular employee 

 * Define class InheritanceTest that has the main method.
 - Create object obj1 of Manager using an Employee class reference variable 
 - Mutator methods to set the values of name and salary 
 - Create object obj2 of Manager using an Manager class refernce variable 
 - Mutator method to set the value of the secretary for obj2
 - Accessor methods for name and salary using obj1
 - Invoke method bonus(float percent) using obj1
 - Accessor method of secretary using obj2  
 */

class Employee{
    private String empName;
    private double empSalary;
    //Mutator method to set employee name
    public void set_empName(String name){
        this.empName = name;
    }
    //Accessor method to return the employee name 
    public String get_empName(){
        return empName;
    }
    
    //Mutator method to set employee salary
    public void set_salary(double salary){
        this.empSalary = salary;
    }
    //Accessor method to return the employee salary
    public double get_salary(){
        return empSalary;
    }

    //method for calculating the bonus 
    public double bonus(float percent){
        return (percent/100.0)*empSalary;
    }
}

class Manager extends Employee{
    private String secretary;
    //Mutator method to update 
    public void set_secretary(String name){
        this.secretary = name;
    }
    //Accessor method to return the secretary name 
    public String get_secretary(){
        return secretary;
    }

    //Override method bonus 
    public double bonus(float percent){
        double manager_bonus = super.bonus(percent);
        manager_bonus = manager_bonus + (manager_bonus*0.5);
        return manager_bonus;
    }
}

// class containing the main method 
class InheritanceTest{
    public static void main(String [] args){
        //Create object obj1 of Manager using an Employee class reference variable 
        Employee obj1 = new Manager(); 

        obj1.set_empName("Srinjinee Mitra");
        System.out.println("Employee name :"+obj1.get_empName());
        obj1.set_salary(75000);
        System.out.println("Employee salary :"+obj1.get_salary());

        //Create object obj2 of Manager using an Manager class refernce variable 
        Manager obj2 = new Manager();

        obj2.set_secretary("Rahim Ghosh");
        System.out.println("Secreatary name :"+obj2.get_secretary());

        //Invoke bonus for obj1
        float percent = 10f;
        System.out.println("Bonus :"+obj1.bonus(percent));
    }

}
