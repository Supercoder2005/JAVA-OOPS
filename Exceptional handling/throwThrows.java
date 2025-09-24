
public class throwThrows {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above!");
        } 
        else {
            System.out.println("Access granted - Age is valid.");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15);  
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        checkAge(20);
    }
}
