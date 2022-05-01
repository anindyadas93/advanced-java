package finallyblock;

public class Finally {
    public static void main(String args[]) {

        try {
            System.out.println("Inside try block");
            int data = 25 / 5;
            System.out.println(data);
        }
        
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
            System.out.println(e);
        }
        
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}