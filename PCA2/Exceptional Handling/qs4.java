// Java program to show throw and throws keyword significance

public class qs4 {
    // method which throws exception
    static void checkAge(int age) throws ArithmeticException{
        if(age<18){
            // using 'throw' to explicitly throw a new exception object
            throw new ArithmeticException("You are under 18 !");
        }
        else{
            System.out.println("Access granted !");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(15); // this will cause an exception
        }
        catch(ArithmeticException e){
            System.out.println("Exception caught :"+e.getMessage());
        }
        System.out.println("Continue...");
        // no exception case
        checkAge(25);
    }
    
}
