
public class assertionError {
    public static double findSquareRoot(double number){
        assert number >= 0 : "Number must be non-negative";
        return Math.sqrt(number);
    }
    public static void main(String[] args) {
        double res = findSquareRoot(-25);
        System.out.println("Square Root :"+res);
    }
}
