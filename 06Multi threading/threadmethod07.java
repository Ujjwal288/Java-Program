//3. .sleep(millisecond) : Make the current thrread pause for a given time (in millesecond)

class sleepExample extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadmethod07 {
    public static void main(String[] args) {
        sleepExample t1 = new sleepExample();
        t1.start();
    }
}
