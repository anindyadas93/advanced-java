package finalblock;

public class Final {
    final int age = 18;
    void display() {
        age = 55;
    }

    public static void main(String[] args) {
    	Final obj = new Final();
        obj.display();
    }
}