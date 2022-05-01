package protected_modifier;

class Animal {
    protected void display() {
        System.out.println("I am an animal");
    }
}

public class Protected extends Animal{
	public static void main(String args[]){  
		Protected dog = new Protected();
		dog.display();  
	}  
}
