// Java program to implement single try and multiple catch

public class qs2 {
    public static void main(String[] args) {
        try{
            String str = null;
            int len = str.length(); // NullPointerException
            int res = len/0 ; // ArithmeticException 
        }
        catch(NullPointerException e){
            System.out.println("Ecception occurs : "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Exception occurs : "+e);
        }
        catch(Exception e){
            System.out.println("General exception occurs");
        }
    }
}
