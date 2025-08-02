// use of finally block 
public class Example3 {
    public static void divide(int a, int b){
        try{
            System.out.println("Result: "+ (a/b));
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught: "+ e.getMessage());
        }
        // finally will be executed both when exception occurs or not 
        finally{
            System.out.println("Inside finally block - Division attempt finished.");
        }
    }
    public static void main(String[] args) {
        divide(10,2);
        divide(10,0);
    }
    
}
