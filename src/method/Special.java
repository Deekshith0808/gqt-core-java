package method;
class Animal1{
	void eat() {
		System.out.println("Animal eats");
	}
	void run() {
		System.out.println("Animal runs");
	}
	void sleep() {
		System.out.println("Animal sleeps");
	}
}
class Dog1 extends Animal1{
	@Override
	void run() {
		System.out.println("Dog runs fast");
	}
	void bark() {
		System.out.println("Dog barks");
	}
}
class Elephant1 extends Animal1{
	@Override
	void run() {
		System.out.println("Elephant runs slow");
	}
	void trunk() {
		System.out.println("Elephant have trunk");
	}
}
class snail extends Animal1{
	@Override
	void run() {
		System.out.println("snail goes very slow");
	}
	void eyes() {
		System.out.println("snail eyes are over its ears");
	}
}
public class Special {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		Elephant1 e = new Elephant1();
		snail s = new snail();
		
		d.eat();
		d.run();
		d.sleep();
		d.bark();
		System.out.println("------------");
		
		e.eat();
		e.run();
		e.sleep();
		e.trunk();
		System.out.println("---------------");
		
		s.eat();
		s.run();
		s.sleep();
		s.eyes();
		System.out.println("---------------");
	}
}
