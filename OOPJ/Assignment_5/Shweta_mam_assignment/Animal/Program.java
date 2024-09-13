package Animal;
class Animal{
	
	
	public void eat()
	{
		System.out.println("Eating");
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
}

class Dog extends Animal{
	
	public void bark()
	{
		System.out.println("Barking");
	}
	
	public void show() {
	  this.eat();
	  this.sleep();
	  this.bark();
	}
}
public class Program {
	public static void main(String args[])
	{
		Dog d=new Dog();
		
		d.show();
	}

}
