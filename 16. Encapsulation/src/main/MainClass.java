package main;
import model.Student;

public class MainClass {
	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName(1, "Alex", "USA");
		s2.setName(2, "Adam", "UK");
		
		s1.getName();
		s2.getName();
	}
}
