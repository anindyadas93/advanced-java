package TryCatchBlock;

import java.util.Scanner;

public class TryCatch {    
    public static void main(String[] args) {  
    	Scanner scr = new Scanner(System.in);
    	System.out.println("Enter number : ");
    	int n = scr.nextInt();
        try {  
        	int data=50/n;
        	System.out.println("Result = "+data);
        } catch(Exception e) {
        	System.out.println("Can't divided by zero");  
        }
        scr.close();
    }  
      
}  
