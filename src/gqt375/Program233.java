package gqt375;
/**
 * @author sai deekshith
 */
abstract class Animal11 {
	abstract void makeSound();
	void sleep() {
		System.out.println("This animal is sleeping...");
	}
}
class Dog11 extends Animal11 {
	@Override
	void makeSound() {
		System.out.println("Dog says: Woof Woof!");
	}
}
class Cow11 extends Animal11 {
	@Override
	void makeSound() {
		System.out.println("Cow says: Moo Moo!");
	}
}
public class Program233 {
	public static void main(String[] args) {
		Animal11 a1 = new Dog11();
		Animal11 a2 = new Cow11();
		System.out.println("Dog:");
		a1.makeSound();
		a1.sleep();
		System.out.println("\nCow:");
		a2.makeSound();
		a2.sleep();
	}
}
