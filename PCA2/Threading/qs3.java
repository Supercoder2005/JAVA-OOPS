// write a java program to print "Hello" 5 times,1 sec pause with user created thread;
// "Hi" 5 times with another user created thread ;
// "Hi Hello" 5 times in main thread, all have 1 sec pause

class Thread1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Hi");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class qs3{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        for(int i=1;i<=5;i++){
            System.out.println("Hi Hello");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Main Thread Exiting...");
    }
}