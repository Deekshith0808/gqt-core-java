package method;
class Animall{
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
class Dogg extends Animall{
	@Override
	void run() {
		System.out.println("Dog runs fast");
	}
	void bark() {
		System.out.println("Dog barks");
	}
}
class Elephantt extends Animall{
	@Override
	void run() {
		System.out.println("Elephant runs slow");
	}
	void trunk() {
		System.out.println("Elephant have trunk");
	}
}
class snaill extends Animall{
	@Override
	void run() {
		System.out.println("snail goes very slow");
	}
	void eyes() {
		System.out.println("snail eyes are over its ears");
	}
}
public class Animalref {
	public static void main(String[] args) {
		Dogg d = new Dogg();
		Elephantt e = new Elephantt();
		snaill s = new snaill();
		
		Animall ref ;
		ref = d;
		ref.eat();
		ref.run();
		ref.sleep();
		d.bark();
		System.out.println("------------");
		
		ref = e;
		ref.eat();
		ref.run();
		ref.sleep();
		e.trunk();
		System.out.println("---------------");
		
		ref = s;
		ref.eat();
		ref.run();
		ref.sleep();
		s.eyes();
		System.out.println("---------------");
	}
}
