interface task{  
	float operation();  
}

class Add implements task{  
	public float operation(){
		int x=0;
		x=5+10;
		return x;
	}  
}  

class Sub implements task{  
	public float operation(){
		int x=0;
		x=10-5;
		return x;
	}  
} 

public class ComplexInterface {
	public static void main(String args[]) {
		Add a = new Add();
		System.out.println(a.operation());
		Sub s = new Sub();
		System.out.println(s.operation());
	}
}
