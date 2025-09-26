package gqt375;
/**
 * @author sai deekshith
 */
abstract class Vehicle7 {
	abstract void drive();
	abstract void stop();
}
class Car7 extends Vehicle7 {
	@Override
	public void drive() {
		System.out.println("Car is driving.");
	}
	@Override
	public void stop() {
		System.out.println("Car is stopping.");
	}}
class Truck extends Vehicle7 {
	@Override
	public void drive() {
		System.out.println("Truck is driving.");
	}
	@Override
	public void stop() {
		System.out.println("Truck is stopping.");
	}
}
public class Program220 {
	public static void main(String[] args) {
		Vehicle7 car7 = new Car7();
		Vehicle7 truck = new Truck();
		car7.drive();
		car7.stop();
		truck.drive();
		truck.stop();
	}
}
