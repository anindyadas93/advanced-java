package delete;
import java.io.File;

public class Delete {
  public static void main(String[] args) { 
    File myObj = new File("C:\\Users\\anind\\eclipse-workspace\\20. File Handling\\src\\delete\\test.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
