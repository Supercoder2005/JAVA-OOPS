
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try{
            int res = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            System.out.println("Inside try-finally block");
        }
        finally{
            System.out.println("Finally block always executes");
        }
        try{
            int[] arr = new int[5];
            arr[5] = 10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally block alawys executes");
        }
    }
}
