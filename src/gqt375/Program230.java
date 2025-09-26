package gqt375;
/**
 * @author sai deekshith
 */
abstract class Vehicle9 {
	abstract void start();
	abstract void stop();
}
class Car9 extends Vehicle9 {
	@Override
	void start() {
		System.out.println("Car is starting.");
	}
	@Override
	void stop() {
		System.out.println("Car is stopping.");
	}
}
class Motorcycle9 extends Vehicle9 {
	@Override
	void start() {
		System.out.println("Motorcycle is starting.");
	}
	@Override
	void stop() {
		System.out.println("Motorcycle is stopping.");
	}
}
public class Program230 {
	public static void main(String[] args) {
		Vehicle9 car9 = new Car9();
		Vehicle9 motorcycle9 = new Motorcycle9();
		car9.start();
		car9.stop();
		motorcycle9.start();
		motorcycle9.stop();
	}
}
