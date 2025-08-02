
public class Example1 {
    public static void main(String[] args) {
        int a = 10, b = 0;
        //try block is used to seperate out the part of the code which may throw an error
        try{
            int res = a/b;
        }
        //catch block is used to specify which error/exception you have made 
        catch(ArithmeticException e){ // here ArithmeticException is the exception class and e is object of that class
            // if you don't know the specified exception subclass name , you can use the parent vlass Exception 
            System.out.println(e);
            System.out.println(e.getMessage());
        }

        try{
            int c=100,d=0;
            int val = c/d;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
