package multicatchblock;


public class MultiCatch {  
    public static void main(String[] args) {  
    	try{
    		int a[] = new int[5]; // 0 1 2 3 4
    		a[4]=0;
    		
    		String s=null;  
    		System.out.println(s.length());  
    	}    
    	catch(ArithmeticException e) {  
    		System.out.println("Arithmetic Exception occurs");  
    	}    
    	catch(ArrayIndexOutOfBoundsException e) {  
    		System.out.println("ArrayIndexOutOfBounds Exception occurs");  
    	}    
    	catch(Exception e) {  
    		System.out.println("General Exception occurs");  
    	}             
    	System.out.println("rest of the code");    
    }  
}  