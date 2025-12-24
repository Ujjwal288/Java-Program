class MyThread1 extends Thread {   //User thread 
    @Override
    public void run() {
        for(int i=0;i<=10;i++) {
            System.out.println("Thread1 is running !!" + Thread.currentThread().getName());
        }
    }
}

class MyThread2 extends Thread {  //User thread 
    @Override
    public void run() {
        for(int i=0;i<=10;i++) {
            System.out.println("Thread2 is running !!" + Thread.currentThread().getName());
        }
    }
}

public class threadextend01 {
    public static void main(String[] args) {
        System.out.println("MAin is starting ");
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        System.out.println("Main is ending");   //Main method can finish but the program will keep running until
        //all user thread have completed
    }
}