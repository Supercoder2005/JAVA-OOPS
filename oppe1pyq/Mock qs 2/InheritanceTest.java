import java.util.Scanner;
class Faculty{
   private String name;
   private double salary;
   public Faculty(String name, double salary) {
       this.name = name;
       this.salary = salary;
   }
   public String get_name(){
        return name;
   }
   public double get_salary(){
        return salary;
   }
   public double bonus(float percent){
       return (percent/100.0)*salary;
   }
   // Define method getDetails()
   public void getDetails(){
        System.out.println("Faculty name: "+name+" "+"Salary: "+salary);
   }
    // Override method getDetails(float percent)
    public void getDetails(float percent){
        System.out.println("Faculty name: "+name+" "+"Salary: "+salary+" "+"Bonus: "+bonus(percent));
    }
}
class Hod extends Faculty{
    private String personalAssistant;
    public Hod(String name, double salary, String pa) {
        super(name, salary);
        this.personalAssistant = pa;
    }
    // Override method bonus(float percent)
    public double bonus(float percent){
        return super.bonus(percent)-(super.bonus(percent)*0.5);
    }
    // Override method getDetails()
    public void getDetails(){
        System.out.println("HOD name: "+super.get_name()+" "+"Salary: "+super.get_salary()+" "+"Personal assistant: "+personalAssistant);
    }
    // Override method getDetails(float percent)
    public void getDetails(float percent){
        System.out.println("HOD name: "+super.get_name()+" "+"Salary: "+super.get_salary()+" "+"Bonus: "+bonus(percent));
    }
}
public class InheritanceTest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        obj1.getDetails();
        obj1.getDetails(10);
        obj2.getDetails();
        obj2.getDetails(10);
        sc.close();
    }
}
