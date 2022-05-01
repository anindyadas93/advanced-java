package thread_join;

class ThreadJoin extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
        System.out.println("...");
    }
    public static void main(String args[]) throws InterruptedException {
    	ThreadJoin t1 = new ThreadJoin();
    	ThreadJoin t2 = new ThreadJoin();
    	ThreadJoin t3 = new ThreadJoin();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
    }
}
