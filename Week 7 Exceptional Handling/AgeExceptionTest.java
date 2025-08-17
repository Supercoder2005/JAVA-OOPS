import java.util.Scanner;
    //DEFINE a user-defined exception: InvalidAgeException
    class InvalidAgeException extends Exception{
        public InvalidAgeException(String message){
            super(message);
        }
    }
    public class AgeExceptionTest {
        //DEFINE method isEligibletoVote
        public static Boolean isEligibletoVote(int age) throws InvalidAgeException{
            if(age < 18){
                throw new InvalidAgeException("Invalid age to vote.");
            }
            return true;
        }
        //DEFINE method isEligibletoWriteUPSC
        public static Boolean isEligibletoWriteUPSC(int age) throws InvalidAgeException{
            if(age > 32){
                throw new InvalidAgeException("Invalid age to write UPSC.");
            }
            return true;
        }
        public static void main(String[] args) {
            int age;
            Scanner sc = new Scanner(System.in);
            age = sc.nextInt();
            try{
                isEligibletoVote(age);
                isEligibletoWriteUPSC(age);
                System.out.println("Eligible to vote and to write UPSC");
            }
            catch(InvalidAgeException ie){
                System.out.println(ie.getMessage());
            }
            sc.close();
        }
    }