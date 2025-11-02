import java.util.*;
// Custom exception for invalid PIN 
class InvalidPinException extends Exception{
    public InvalidPinException(String message){
        super(message);
    }
}
// Custom exception for insufficient balance
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}
public class toughQs {

    static void pinChecking(int pin) throws InvalidPinException{
        if(pin != 1234){
            throw new InvalidPinException("Invalid PIN entered !!!");
        }
    }

    static void withdraw(double balance,double amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException("Insufficient fund !!!");
        }
        else if(amount<0){
            throw new ArithmeticException("Withdrawal amount can't be negative !!!");
        }
        else{
            System.out.println("Withdrawal of Rs. "+amount+" is successful");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 10000.0; // initial balance
        try{
            System.out.println("Enter the PIN :");
            int pin = sc.nextInt();
            pinChecking(pin);

            // inner try block for withdrawal amount checking
            try{
                System.out.println("Enter the withdrawal amount :");
                double amount = sc.nextDouble();
                withdraw(balance,amount);
            }
            catch(InsufficientFundsException e){
                System.out.println(e.getMessage());
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        catch(InvalidPinException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Unexpected error occured !!!");
        }
        finally{
            System.out.println("Transaction session ended .");
        }

    }
}
