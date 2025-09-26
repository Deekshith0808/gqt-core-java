package gqt375;
/**
 * @author sai deekshith
 */
abstract class Vehicle1 {
	abstract void start();
	abstract void stop();
}
class Car1 extends Vehicle1 {
	@Override
	void start() {
		System.out.println("Car is starting.");
	}
	@Override
	void stop() {
		System.out.println("Car is stopping.");
	}
}
class Motorcycle1 extends Vehicle1 {
	@Override
	void start() {
		System.out.println("Motorcycle is starting.");
	}
	@Override
	void stop() {
		System.out.println("Motorcycle is stopping.");
	}
}
public class Program213{
	public static void main(String[] args) {
		Vehicle1 car = new Car1();
		Vehicle1 motorcycle = new Motorcycle1();
		car.start();
		car.stop();
		motorcycle.start();
		motorcycle.stop();
	}
}