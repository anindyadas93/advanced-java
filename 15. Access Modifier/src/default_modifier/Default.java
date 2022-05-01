package default_modifier;
import mytest.*; 

public class Default {
	public static void main(String args[]){  
		TestC obj = new TestC();//Compile Time Error  
		obj.msg();//Compile Time Error  
	} 
}