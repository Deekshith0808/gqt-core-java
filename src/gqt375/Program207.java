package gqt375;
/**
 * @author sai deekshith
 */
abstract class Animal1 {
	abstract void eat();
	abstract void sleep();
}
class Dog1 extends Animal1 {
	@Override
	void eat() {
		System.out.println("Dog is playing.");
	}
	@Override
	void sleep() {
		System.out.println("Dog is eating.");
	}
}
class Cat1 extends Animal1 {
	@Override
	void eat() {
		System.out.println("Cat is eating the rat.");
	}
	@Override
	void sleep() {
		System.out.println("Cat drink milk also.");
	}
}
public class Program207 {
	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		Cat1 cat = new Cat1();
		dog.eat();
		dog.sleep();
		cat.eat();
		cat.sleep();
	}
}
