// Higher Degree Method : whena method takes / passes another method() as it's parameter 
// the method passed through the parameter must be a Functional Interface , containing only one method inside it.

interface Calculator{ // functional interface
    int operation(int a,int b);
}
public class Example01 {
    // method that takes a Calculator (functional interface) and two numbers 
    public static int compute(int a, int b, Calculator op){
        return op.operation(a,b);
    }
    public static void main(String[] args) {
        //Lamba for addition
        Calculator add = (x,y) -> x+y;
        Calculator mul = (x,y) -> x*y;
        //Directly pass lamba without naming it 
        int result = compute(10,40,add);
        int result1 = compute(10,40,mul);
        System.out.println("Addition :"+result);
        System.out.println("Multiplication :"+result1);
    }
}
