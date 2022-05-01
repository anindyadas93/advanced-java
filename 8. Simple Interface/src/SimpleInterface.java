interface printable{  
	void print();  
}  

class AnotherClass implements printable {
	public void print() {
		System.out.println("Hello 1");
		System.out.println(5+10);
	}
}

class SimpleInterface implements printable{  
	public void print(){
		System.out.println("Hello");
	}  
  
	public static void main(String args[]){  
		SimpleInterface obj = new SimpleInterface();  
		obj.print();
		AnotherClass ac = new AnotherClass();
		ac.print();
	}  
}  