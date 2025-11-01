// Java program to implement nested try-catch block

public class qs3 {
    public static void main(String[] args) {
        try{
            String str = null;
            int len = str.length(); // NullPointerException
            try{
                int res = len/0; // ArithmeticException
            }
            catch(ArithmeticException e){
                System.out.println("Exception occurs : Integer can't be divided by zero.");
            }
        }
        catch(NullPointerException e){
            System.out.println("Exception occurs : can't find out the length of a null string.");
        }
    }
}
