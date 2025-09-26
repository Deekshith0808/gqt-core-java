package gqt375;
/**
 * @author sai deekshith
 */
class Vehicle16 {
	void startEngine() {
		System.out.println("Engine started.");
	}
	void stopEngine() {
		System.out.println("Engine stopped.");
	}
}
class Car16 extends Vehicle16 {
	void drive() {
		System.out.println("Driving a car.");
	}
}
class Bike16 extends Vehicle16 {
	void ride() {
		System.out.println("Riding a bike.");
	}
}
public class Program241 {
	public static void main(String[] args) {
		Car16 car = new Car16();
		System.out.println("Car Actions:");
		car.startEngine();
		car.drive();
		car.stopEngine();
		System.out.println();
		Bike16 bike = new Bike16();
		System.out.println("Bike Actions:");
		bike.startEngine();
		bike.ride();
		bike.stopEngine();
	}
}
