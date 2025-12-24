//5. .getName()/.setName() : Used to get or set the thread name 

class getSetExample extends Thread {
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("Thread is running :" + Thread.currentThread().getName());
        }
    }
}

public class threadmethod09 {
    public static void main(String[] args) {
        getSetExample t1 = new getSetExample();
        t1.setName("harry");
        t1.start();
        System.out.println("Thread name is :" + t1.getName());
    }
}