class lifeCycleThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1000);  //Moves to waiting state
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished running");
    }
}

public class threadlifecycle03 {
    public static void main(String[] args) {
        lifeCycleThread t = new lifeCycleThread();
        System.out.println("Thread state after creation :" + t.getState());
        t.start();
        System.out.println("Thread state after start :" + t.getState());
        try {
            Thread.sleep(500);
            System.out.println("Thread state while sleeping :" + t.getState());
            t.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread state after completion :" + t.getState());
    }
}
