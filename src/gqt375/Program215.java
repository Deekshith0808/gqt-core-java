package gqt375;
/**
 * @author sai deekshith
 */
abstract class Animal2 {
	abstract void sound();
	void eat() {
		System.out.println("This animal eats food.");
	}
}
class Dog3 extends Animal2 {
	@Override
	void sound() {
		System.out.println("Dog barks: Woof Woof!");
	}
}
class Cat3 extends Animal2 {
	@Override
	void sound() {
		System.out.println("Cat meows: Meow Meow!");
	}}
public class Program215 {
	public static void main(String[] args) {
		Animal2 dog = new Dog3();
		Animal2 cat = new Cat3();
		dog.sound();
		dog.eat();
		cat.sound();
		cat.eat();
	}
}