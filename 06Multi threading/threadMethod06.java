//1. .start() : Start a new thread and interanlly calls the run() method.
//2. .run() : Contains the task code that the thread will execute.

class runSleepExample extends Thread {
    public void run() {
        System.out.println("Thread is running :" + Thread.currentThread().getName());
    }
}

public class threadMethod06 {
    public static void main(String[] args) {
        runSleepExample t1 = new runSleepExample();
        t1.start();  //Starts a new thread
    }
    
}
