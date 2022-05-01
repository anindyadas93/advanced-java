package model;

public class Student {
	private int roll;
	private String name;
	private String address;
	
	public void setName(int roll, String name, String address) {
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	
	public void getName() {
		System.out.println("Roll : "+roll);
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
	}
}
