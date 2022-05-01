package write;

import java.io.*;


public class Write {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("C:\\Users\\anind\\eclipse-workspace\\20. File Handling\\src\\write\\test.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
