// Write a java program to implement try-catch, try-finally and try-catch-finally.

public class qs1 {
    public static void main(String[] args) {
        try{
            int res = 10/0; // ArithmeticException
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occured : "+e);
        }
        try{
            System.out.println("Inside the try-finally block.");
        }
        finally{
            System.out.println("Finally block always happens.");
        }
        try{
            int[] arr = new int[5];
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occured : "+e);
        }
        finally{
            System.out.println("Finally block always executes.");
        }
    }
}
