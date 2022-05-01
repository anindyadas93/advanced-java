package create;

import java.io.File;
import java.io.IOException;

public class Create {
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\anind\\eclipse-workspace\\20. File Handling\\src\\create\\test.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
