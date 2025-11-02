// multiple thread od same functionallity

public class multipleThreadsOfSameFunctionallity extends Thread{
    public void run() {
        // This code runs in the new thread
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " exiting...");
    }

    public static void main(String args[]) {
        // Create two thread objects
        multipleThreadsOfSameFunctionallity t1 = new multipleThreadsOfSameFunctionallity();
        multipleThreadsOfSameFunctionallity t2 = new multipleThreadsOfSameFunctionallity();

        // Set thread names
        t1.setName("Child Thread 1");
        t2.setName("Child Thread 2");

        // Start both threads
        t1.start();
        t2.start();

        // Main thread work
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread - Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Main Thread exiting...");
    }
}
    

