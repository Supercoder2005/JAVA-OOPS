package PCA1.Constructor;
class Employee{
    String name;
    String designation;
    double salary;
    void display(){
        System.out.println("Name :"+name+" ,Designation :"+designation+" ,Salary :"+salary);
    }
}
public class qs4 {
    public static void main(String[] args) {
        Employee e = new Employee();  // Default constructor ( String : null , int : 0 , double : 0.0)
        e.display();
    }
}
