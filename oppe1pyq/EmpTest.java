/*
1. Write a java code as instructecd.[Basic class and method]
- Define class Employee that has the following members :
- Private instance variables String empName, double salary
- Mutator methods to update the instance variables
- Accessor methods to access the instance variables 
- Method public double bonus (float percent) that returns the bonus computed as (percent/100.0)*salary 

- Define class EmpTest that has the main method and following functionalities :
- Create an Employee object 
- Invoke mutator methods to set the values of the name and salary 
- Invoke accessor methods to get the details of an Employee 
- Invoke method bonus (float percent) to get bonus of an Employee
*/

class Employee{
    private String empName;
    private double salary;

    // mutator method to set employee name
    public void set_empName(String name){
        this.empName = name;
    }
    //Accessor method to return the employee name
    public String get_empName(){
        return empName;
    }

    // mutator method to set employee salary
    public void set_salary(double salary){
        this.salary = salary;
    }
    //Accessor method to return the employee salary
    public double get_salary(){
        return salary;
    } 

    // method for calculating the bonus 
    public double bonus(float percent){
        return (percent/100.0)*salary;
    }
}

public class EmpTest{
    public static void main(String args []){
        // creating new object of Employee class
        Employee e = new Employee();

        // invoke the empName and print 
        e.set_empName("Srinjinee Mitra");
        System.out.println("The name of the employee: "+e.get_empName());

        // invoke the empSalary and print
        e.set_salary(90000);
        System.out.println("The salary of the employee: "+e.get_salary());

        //invoke the bonus method after initialising the percent variable
        float percent = 10f;
        System.out.println("The bonus of the employee: "+e.bonus(percent));
    }
}



