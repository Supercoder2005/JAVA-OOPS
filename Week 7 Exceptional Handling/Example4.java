// getting the actual cause of the exception
class PaymentFailedException extends Exception{
    public PaymentFailedException(String msg){
        super(msg);
    }
}

class BankAPI{
    public static void pay(int amount) throws ArithmeticException{
        int result = amount/0;
    }
}
public class Example4 {
    public static void processPayment(int amount) throws PaymentFailedException{
        try{
            BankAPI.pay(amount);
        }
        catch(ArithmeticException e){
            PaymentFailedException ex = new PaymentFailedException("Payment processing failed.");
            ex.initCause(e); // setting the actual cause 
            throw ex;
        }
    }
    public static void main(String[] args) {
        try{
            processPayment(1000);
        }
        catch(PaymentFailedException e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause()); // getCause is showing the cause of the exception
        }
    }
}
