
public class Example1 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        //try block is used to seperate out the part of the code which may throw an error
        try{
            int res = a/b;
        }
        //catch block is used to specify which error/exception you have made 
        catch(ArithmeticException e){ // here ArithmeticException is the exception class and e is object of that class
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
