package sleeping_thread;
import java.lang.Thread;

class SleepingThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]) {
    	SleepingThread t1 = new SleepingThread();

        t1.start();
    }
}