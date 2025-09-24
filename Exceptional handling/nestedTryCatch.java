
public class nestedTryCatch {
    public static void main(String[] args) {
       try {
            int[] arr = new int[5];
            arr[2] = 10 / 0;  
            try {
                arr[10] = 50;  
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught in inner catch: " + e);
            }

        } 
        catch (ArithmeticException e) {
            System.out.println("Caught in outer catch: " + e);
        } 
        catch (Exception e) {
            System.out.println("Caught in outer general catch: " + e);
        } 
    }
}
