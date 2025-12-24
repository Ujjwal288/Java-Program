class th implements Runnable {
    public th (String name) {
    }
    public void run() {
        for(int i=0;i<=4;i++) {
            System.out.println("Thrad is running :" + Thread.currentThread().getName());
        }
    }
}

public class threadconstructor05 {
    public static void main(String[] args) {
        th t1 = new th("ujjwal");
        Thread r1 = new Thread(t1);
        r1.start();
        th t2 = new th("harry");
        Thread r2 = new Thread(t2);
        r2.start();
        System.out.println("Name of thread t1 is :" + r1.getName());
        System.out.println("name of thread t2 is :" + r2.getName());
    }
}
