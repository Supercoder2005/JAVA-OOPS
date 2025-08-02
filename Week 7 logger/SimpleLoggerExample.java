
import java.util.logging.*;
public class SimpleLoggerExample {
    //get logger for this class
    private static final Logger logger = Logger.getLogger(SimpleLoggerExample.class.getName());
    public static void process(){
        logger.info("Aplication started.");
        try{
            int result = divide(10,0); // generate a zero division error
            logger.info("Result :"+ result);
        }
        catch(ArithmeticException e){
            logger.severe("Exception error :"+e.getMessage());
        }
        logger.warning("This is a warning message.");
        logger.log(Level.INFO,"Application finished.");
        logger.log(Level.FINE,"Terminated.");
    }
    public static void endProcess(){
        logger.log(Level.WARNING,"This is a warning message");
        logger.log(Level.INFO,"Application finished");
    }
    public static int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        process();
        logger.setLevel(Level.ALL);
        // logger.setLevel(Level.OFF);
        endProcess();
    }
}
