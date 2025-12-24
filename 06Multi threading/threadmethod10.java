//6.   .isAlive(): check if a thread is still running (return true if active else false)

class isAliveExample extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Thread finished work");
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class threadmethod10 {
    public static void main(String[] args) {
        isAliveExample t1 = new isAliveExample();
        System.out.println("Before start :" + t1.isAlive());
        t1.start();
        System.out.println("After starting :" + t1.isAlive());
        try {
            t1.join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After completion :" + t1.isAlive());
    }
}
