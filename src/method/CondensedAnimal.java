package method;
class AAnimal{
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
class DDog extends AAnimal{
	@Override
	void run() {
		System.out.println("Dog runs fast");
	}
	void bark() {
		System.out.println("Dog barks");
	}
}
class EElephant extends AAnimal{
	@Override
	void run() {
		System.out.println("Elephant runs slow");
	}
	void trunk() {
		System.out.println("Elephant have trunk");
	}
}
class ssnail extends AAnimal{
	@Override
	void run() {
		System.out.println("snail goes very slow");
	}
	void eyes() {
		System.out.println("snail eyes are over its ears");
	}
}
class jungle{
	void permit(AAnimal ref) {
		ref.eat();
		ref.run();
		ref.sleep();
	}
}
public class CondensedAnimal {
	public static void main(String[] args) {
		DDog d = new DDog();
		EElephant e = new EElephant();
		ssnail s = new ssnail();
		jungle j = new jungle();
		
		j.permit(d);
		d.bark();
		System.out.println("------------");
		
		j.permit(e);
		e.trunk();
		System.out.println("---------------");
		
		j.permit(s);
		s.eyes();
		System.out.println("---------------");
	}
}

