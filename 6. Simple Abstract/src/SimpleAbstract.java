abstract class Bike{
	abstract void run();
	void start() {System.out.println("bike starting");}
}

class Honda extends Bike {
	void run(){System.out.println("Honda bike running");}
}

class SimpleAbstract extends Bike{
	 void run(){System.out.println("bike running..");}

	 public static void main(String args[]){
		 Bike obj = new SimpleAbstract();
		 obj.run();
		 Bike b = new Honda();
		 b.run();
		 b.start();
	 }
}

