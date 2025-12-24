//7. .interrupt(): uSED TO INTERRUPT a thread that is sleeping,waiting or blocked.
//8. .Thread.activeCount() : Returns the nuber of active thread currently running in the program
//9. .currentThread() : A static method that return a reference to the currntly executing thread.

class interruptExample extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Thread comp;eted normally");
        }
        catch (InterruptedException e){
            System.out.println("Thread was interrupted");
        }
    }
}

public class threadmethod11 {
    public static void main(String[] args) {
        interruptExample t1 = new interruptExample();
        t1.start();
        t1.interrupt();  //Interrupted while sleeping
    }
}
