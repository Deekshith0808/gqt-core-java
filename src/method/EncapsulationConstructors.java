package method;
class Dog{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	//zero parametarized constructor
	public Dog() {
		super();
		System.out.println("Inside zero parametarized constructor");
		this.name = "Ramu";
		this.color = "Brown";
		this.cost = 7000;
		this.age = 3;
		this.breed = "pumorian";
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
	}
	
	// one parametarized constructor
	public Dog(String name) {
		this();
		System.out.println("Inside one parametarized constructor");
		this.name = name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");

	}
	
	// two paramitarized constructor
	public Dog(String name, String color) {
		this("Chintu");
		System.out.println("Inside two paramitarized constructore");
		this.name= name;
		this.color= color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
	// three paramitarized constructor
	public Dog(String name, String color, int cost) {
		this("Tommy", "Blue");
		System.out.println("Inside three paramitarized constructore");
		this.name= name;
		this.color= color;
		this.cost = cost;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
	// four paramitarized constructor
	public Dog(String name, String color, int cost, int age) {
		this("Dobby", "Orange", 9000);
		System.out.println("Inside four paramitarized constructore");
		this.name= name;
		this.color= color;
		this.cost = cost;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
	// five paramitarized constructor
	public Dog(String name, String color, int cost, int age, String breed) {
		this("Jimmy", "Purple", 7500, 7);
		System.out.println("Inside five paramitarized constructore");
		this.name= name;
		this.color= color;
		this.cost = cost;
		this.age = age;
		this.breed = breed;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-----------------");
	}
}

public class EncapsulationConstructors {

	public static void main(String[] args) {
		Dog d1 = new Dog("Deva", "White", 8000, 1, "Shitzu");
	}

}
