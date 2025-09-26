package gqt375;
/**
 * @author sai deekshith
 */
class Animal15 {
	String species = "Generic Animal";
	void eat() {
		System.out.println(species + " is eating...");
	}
}
class Dog15 extends Animal15{
	String breed = "Labrador";
	void bark() {
		System.out.println("The " + breed + " is barking...");
	}
}
public class Program247{
	public static void main(String[] args) {
		Animal15 a = new Animal15();
		System.out.println("Base Class - Animal:");
		System.out.println("Species: " + a.species);
		a.eat();
		System.out.println();
		Dog15 d = new Dog15();
		System.out.println("Derived Class - Dog:");
		System.out.println("Species (inherited): " + d.species);
		System.out.println("Breed: " + d.breed);
		d.eat();
		d.bark();
	}
}
