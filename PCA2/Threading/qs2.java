// Thread using runnable interface
class MyThread implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(1000); // pause for 1 second
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Child thread finished.");
    }
}
public class qs2 {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Good Morning.");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Main Thread finished.");
    }
}
