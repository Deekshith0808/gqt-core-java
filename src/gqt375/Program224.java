package gqt375;
/**
 * @author sai deekshith
 */
abstract class Animal8 {
	abstract void eat();
	abstract void sleep();
}
class Dog8 extends Animal8 {
	@Override
	void eat() {
		System.out.println("Dog is eating.");
	}
	@Override
	void sleep() {
		System.out.println("Dog is sleeping.");
	}
}
class Cat8 extends Animal8 {
	@Override
	void eat() {
		System.out.println("Cat is eating.");
	}
	@Override
	void sleep() {
		System.out.println("Cat is sleeping.");
	}
}
public class Program224 {
	public static void main(String[] args) {
		Dog8 dog = new Dog8();
		Cat8 cat = new Cat8();
		dog.eat();
		dog.sleep();
		cat.eat();
		cat.sleep();
	}
}
