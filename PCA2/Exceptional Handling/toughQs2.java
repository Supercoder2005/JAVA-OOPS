import java.util.*;
class InvalidMarksException extends Exception{
    public InvalidMarksException(String message){
        super(message);
    }
}

public class toughQs2 {

    static void checkMarks(int marks) throws InvalidMarksException{
        if(marks<0 || marks>100){
            throw new InvalidMarksException("Invalid Marks given !!!");
        }
    }

    static double average(int[] marks) throws ArithmeticException{
        double avg = 0.0;
        if(marks.length == 0){
            throw new ArithmeticException("Division by zero error ! No subjects entered.");
        }
        else{
            for(int i=0;i<marks.length;i++){
                avg = avg+marks[i];
            }
        }
        return (avg/marks.length);
    }
    static String grade(double mark){
        if(mark>=90 && mark<=100){
            return "A+";
        }
        else if(mark>=80){
            return "A";
        }
        else if(mark>=70){
            return "B";
        }
        else if(mark>=60){
            return "C";
        }
        else{
            return "Fail";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name :");
        String name = sc.nextLine();
        System.out.println("Enter marks in 3 subjects seperated by spaces :");
        int[] marks = new int[3];
        for(int i=0;i<marks.length;i++){
            int mark = sc.nextInt();
            try{
                checkMarks(mark);
                marks[i] = mark;
            }
            catch(InvalidMarksException e){
                System.out.println(e.getMessage());
            }
        }
        try{
            double avg = average(marks);
            System.out.println("Average marks = "+avg);
            System.out.println("Grade :"+grade(avg));
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } 
        finally{
            System.out.println("Result processing completed.");
        }
    }
}
