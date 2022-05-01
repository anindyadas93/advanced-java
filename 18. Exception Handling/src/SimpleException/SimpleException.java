package SimpleException;

public class SimpleException{  
	public static void main(String args[]){  
		try{   
	      int data=100/0;
	      System.out.println(data);
		}catch(Exception e){
			System.out.println(e);
			System.out.println("Please enter a value more than zero");
		}  
		System.out.println("rest of the code...");  
	}  
}  