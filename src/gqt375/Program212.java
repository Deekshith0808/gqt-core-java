package gqt375;
/**
 * @author sai deekshith
 */
abstract class Vehicle {
	abstract void start();
	abstract void stop();
}
class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("Car is starting.");
	}
	@Override
	void stop() {
		System.out.println("Car is stopping.");
	}
}
class Motorcycle extends Vehicle {
	@Override
	void start() {
		System.out.println("Motorcycle is starting.");
	}
	@Override
	void stop() {
		System.out.println("Motorcycle is stopping.");
	}
}
public class Program212 {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();
		car.start();
		car.stop();
		motorcycle.start();
		motorcycle.stop();
	}
}
