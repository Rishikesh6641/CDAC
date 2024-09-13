package engine_in;
class Vehicle{
	
	public void startEngine()
	{
		System.out.println("Vehicle Engine Method");
	}
	public void stopEngine()
	{
		System.out.println("Stop Engine Vehicle method");
	}
}
class Car extends Vehicle{
	
	@Override
	public void startEngine() {
		System.out.println("Car Started...");
	}
	@Override
	public void stopEngine() {
		
		System.out.println("Car stoped...");
	}
}
class Bike extends Vehicle{
	
	@Override
	public void startEngine() {
		System.out.println("Bike Started....");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Bike Stoped");
	}
	
}
public class Program {
	public static void main(String args[])
	{
		Vehicle car=new Car();
		
		car.startEngine();
		car.stopEngine();
		
		Vehicle bike=new Bike();
		
		bike.startEngine();
		bike.stopEngine();
	}
}
