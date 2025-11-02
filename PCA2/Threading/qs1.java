//Access main thread and print “Hello” 5 times with 2 sec pause
public class qs1 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); // accessing the thread that runs the main method
        System.out.println("Main Thread :"+t);
        try{
            for(int i=0;i<5;i++){
                System.out.println("Hello");
                Thread.sleep(2000); // 2 sec pause
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
