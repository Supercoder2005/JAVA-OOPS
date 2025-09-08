class Employee{
    String name;
    int id;
    double basicSalary;
    public Employee(String name, int id, double basicSalary){
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    double calculateSalary(){
        return basicSalary;
    }
}
class Manager extends Employee{
    double allowance;
    public Manager(String name,int id,double basicSalary,double allowance){
        super(name, id, basicSalary);
        this.allowance = allowance;
    }
    double calculateSalary(){
        return (basicSalary+allowance);
    }
}

class developer extends Employee{
    double overtimePay;
    public developer(String name,int id,double basicSalary,double overtimePay){
        super(name, id, basicSalary);
        this.overtimePay = overtimePay;
    }
    double calculateSalary(){
        return (basicSalary+overtimePay);
    }
}

public class qs2{
    public static void main(String[] args) {
        Employee ob = new Manager("Amitava Datta",1,67000,2500);
        System.out.println("Name of Manager :"+ob.getName()+" ,ID :"+ob.getId()+" ,Salary of Manager : "+ob.calculateSalary());
        Employee ob1 = new developer("Srinjinee Mitra", 2, 25000 ,3000);
        System.out.println("Name of developer :"+ob1.getName()+" ,ID :"+ob1.getId()+" ,Salary of developer : "+ob1.calculateSalary());
    }
}
