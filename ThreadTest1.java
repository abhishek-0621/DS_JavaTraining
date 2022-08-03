
public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1=new Bike();
		Car c1=new Car();
		Aircraft a1=new Aircraft();
		b1.start();
		a1.start();
		c1.start();
	}

}
class Bike extends Thread{
	public void run() {
		for(int i=1;i<150;i++) {
			System.out.println("Bike is running");
		}
	}
}
class Car extends Thread{
	public void run() {
		for(int i=1;i<50;i++) {
			System.out.println("\t Car is running");
		}
	}
}
class Aircraft extends Thread{
	public void run() {
		for(int i=1;i<150;i++) {
			System.out.println("\t\t Aircraft is running");
		}
	}
}