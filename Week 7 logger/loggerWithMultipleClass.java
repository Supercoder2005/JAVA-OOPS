import java.util.logging.*;
class Test{
    private static final Logger logger = Logger.getLogger("MyLogger");
    public void run(){
        logger.warning("This is a warning message from run().");
    }
}

public class loggerWithMultipleClass {
    private static final Logger logger = Logger.getLogger("MyLogger");
    public static void process(){
        logger.info("application started.");
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
            logger.severe(e.getMessage());;
        }
        logger.warning("This is a warning message.");
    }
    public static void main(String[] args) {
        process();
        Test t = new Test();
        t.run();
    }
}
