// creating thread by implementing runnable interface which is predefined inside java.lang package
public class createUsingRunnableInterface implements Runnable{
    // overriding the abstract method run() of runnable interface
    public void run(){
        System.out.println("Thread Task.");
    }
    public static void main(String[] args) {
        createUsingRunnableInterface t = new createUsingRunnableInterface();
        // creating object of Thread class by passing object of the class in the constractor
        Thread th = new Thread(t);
        // now calling the start() method of thread class
        th.start();
    }
}
