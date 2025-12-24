class Thr extends Thread {
    public Thr(String name) {
        super(name);
    }
    public void run() {
        for(int i=0;i<=5;i++) {
            System.out.println("Thread is running " + Thread.currentThread().getName());
        }
    }
}

public class threadconstructor04 {
    public static void main(String[] args) {
        Thr t1 = new Thr("Ujjwal");
        Thr t2 = new Thr("harry");
        t1.start();
        t2.start();
        System.out.println("Name of Thread t1 is :" + t1.getName());
        System.out.println("Name of Thread t2 is :" + t2.getName());
        
    }
}
