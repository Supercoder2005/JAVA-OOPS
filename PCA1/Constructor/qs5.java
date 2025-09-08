package PCA1.Constructor;
import java.util.*;
class StudentGrades{
    String name,subject,grade;
    int marks;
    StudentGrades(String name,String subject,int marks){
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }
    String gradeCalc(int marks){
        if(marks>90)
            return "O";
        else if(marks>= 80 && marks<90)
            return "A";
        else if(marks>= 70 && marks<80)
            return "B";
        else 
            return "Not so good marks";
    }
}
public class qs5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter the subject :");
        String subject = sc.nextLine();
        System.out.println("Enter your marks :");
        int marks = sc.nextInt();
        StudentGrades obj = new StudentGrades(name,subject,marks);
        String grade = obj.gradeCalc(marks);
        System.out.println("Your grade is : "+grade);
    }
}
