package create_thread_implementing_thread_name;

public class CreateThread {
    public static void main(String args[]) {
        Thread t = new Thread("My first thread");
        t.start();
        String str = t.getName();
        System.out.println(str);
    }
}