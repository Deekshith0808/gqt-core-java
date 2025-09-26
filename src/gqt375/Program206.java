package gqt375;
/**
 * @author sai deekshith
 */
abstract class Animal {
	abstract void eat();
	abstract void sleep();
}
class Dog extends Animal {
	@Override
	void eat() {
		System.out.println("Dog is eating.");
	}
	@Override
	void sleep() {
		System.out.println("Dog is sleeping.");
	}
}
class Cat extends Animal {
	@Override
	void eat() {
		System.out.println("Cat is eating.");
	}
	@Override
	void sleep() {
		System.out.println("Cat is sleeping.");
	}
}
public class Program206{
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.eat();
		dog.sleep();
		cat.eat();
		cat.sleep();
	}
}
