
public class singleTrymultipleCatch {
    public static void main(String[] args) {
        try{
            int res = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception caught :"+e);
        }
        catch(Exception e){
            System.out.println("General Exception caught :"+e);
        }
    }
}
