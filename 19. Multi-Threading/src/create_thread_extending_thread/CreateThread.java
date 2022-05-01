package create_thread_extending_thread;

class CreateThread extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }
    public static void main(String args[]) {
    	CreateThread t1 = new CreateThread();
        t1.start();
    }
}