// extends Thread class
public class MyThread extends Thread{
    MyThread(){
        super("Demo Thread");
        System.out.println(this);
        start();
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Child thread running :"+i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("Child thread exiting...");
    }
    public static void main(String[] args) {
        MyThread ob = new MyThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread Running: " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
