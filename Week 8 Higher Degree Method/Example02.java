interface Calculator{ // functional interface
    int operation(int a,int b);
}
interface Displayable{
    void print(int r);
}
public class Example02 {
    // method that takes a Calculator (functional interface) and two numbers 
    public static int compute(int a, int b, Calculator op){
        return op.operation(a,b);
    }
    public static void show(int r, Displayable d){
        d.print(r);
    }
    public static void main(String[] args) {
        //Lamba for addition
        Calculator add = (x,y) -> x+y;
        Calculator mul = (x,y) -> x*y;

        //Directly pass lamba without naming it 
        int result = compute(10,40,add);
        int result1 = compute(10,40,mul);
        //inline lamda function
        show(result,(r) -> System.out.println(r));
        show(result1,(r) -> System.out.println(r));
        System.out.println("Addition :"+result);
        System.out.println("Multiplication :"+result1);
    }
}
