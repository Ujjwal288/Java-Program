//4. .join(): Makes one thread wait for another thread to finish before continuing

class joinExample extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(getName() + " running " + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class threadmethod08 {
    public static void main(String[] args) {
        joinExample t1 = new joinExample();
        joinExample t2 = new joinExample();
        t1.start();
        try {
            t1.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
