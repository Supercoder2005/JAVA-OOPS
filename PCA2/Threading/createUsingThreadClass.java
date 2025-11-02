// creating thread by extending Thread class
public class createUsingThreadClass extends Thread{
    // overriding run() method which is already inbuilt inside Thread class
    public void run(){
        System.out.println("Thread Task.");
    }
    public static void main(String[] args) {
        // creating object of class 
        createUsingThreadClass t = new createUsingThreadClass();
        // by calling start() method which is a inbuilt method of Thread class it's calling the run() method
        t.start();
    }
}
