package private_modifier;

class Test {
	private int data=40;  
	private void msg(){
		System.out.println("Hello java");
		System.out.println(data);
	}  
}

public class Default {
	public static void main(String args[]) {
		Test obj=new Test();  
		System.out.println(obj.data);//Compile Time Error  
		obj.msg();//Compile Time Error
	}
} 