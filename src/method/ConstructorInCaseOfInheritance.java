package method;
class Animal{
	public Animal(){
		super();
		System.out.println("Animal zero parametarized constructor is invoked");
	}
	public Animal(String message) {
		super();
		System.out.println("Animal parametarized constructor is invoked");
		System.out.println("The animal constructor has recived a message: "+message);
	}
}
class Elephant extends Animal {
	String name;
	double weight;
	public Elephant() {
		super("Hello from Elephant");
		System.out.println("Hi from Elephant constructor");
	}
	public Elephant(String name, double weight) {
		super();
		this.name = name;
		this.weight= weight;
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}



public class ConstructorInCaseOfInheritance {

	public static void main(String[] args) {
		Elephant  e = new Elephant();
		System.out.println("---------------");
		Elephant e1 = new Elephant("Arjuna", 50000);
	}

}
