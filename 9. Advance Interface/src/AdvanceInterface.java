interface Bank{  
	float rateOfInterest();  
}

class SBI implements Bank{  
	public float rateOfInterest(){return 9.15f;}  
}  

class PNB implements Bank{  
	public float rateOfInterest(){return 9.7f;}  
}  
class AdvanceInterface{  
	public static void main(String[] args){  
		Bank b=new SBI();  
		System.out.println("ROI: "+b.rateOfInterest());  
		Bank p=new PNB();  
		System.out.println("ROI: "+p.rateOfInterest()); 
	}
}  