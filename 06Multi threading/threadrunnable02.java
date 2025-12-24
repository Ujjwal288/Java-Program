class Thread1 implements Runnable {
    public void run() {
        for(int i=0;i<=5;i++) {
            System.out.println("Thread 1 is running" + Thread.currentThread().getName());
        }
    }
}
class Thread2 implements Runnable {
    public void run() {
        for(int i=0;i<=5;i++) {
            System.out.println("Thread2 is running " + Thread.currentThread().getName());
        }
    }
}

public class threadrunnable02 {
    public static void main(String[] args) {
        System.out.println("Main is starting");
        Thread1 th1 = new Thread1();
        Thread r1 = new Thread(th1);

        Thread2 th2 = new Thread2();
        Thread r2 = new Thread(th2);
        r1.start();
        r2.start();
        System.out.println("Main is ending ");
    }
}
