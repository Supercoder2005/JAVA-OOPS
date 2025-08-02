// userdefined Exception class creation which extends the parent Exception class
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}

public class Example2 {
    public static void checkAge(int age) throws AgeException{
        if(age < 18){
            throw new AgeException("Not eligible to vote.");
        }
        else{
            System.out.println("Eligible to vote.");
        }
    }
    public static void main(String[] args) {
        try{
            checkAge(16);
        }
        catch(AgeException e){
            System.out.println(e.getMessage());
        }
    }
}
