package gqt375;
/**
 * @author sai deekshith
 */
abstract class Transport {
	abstract void move();
	void fuelType(String type) {
		System.out.println("Fuel type: " + type);
	}}
class Bus extends Transport {
	@Override
	void move() {
		System.out.println("Bus moves on roads.");
	}}
class Train extends Transport {
	@Override
	void move() {
		System.out.println("Train moves on tracks.");
	}}
public class Program225 {
	public static void main(String[] args) {
		Transport t1 = new Bus();
		Transport t2 = new Train();
		System.out.println("Bus Details:");
		t1.move();
		t1.fuelType("Diesel");
		System.out.println("\nTrain Details:");
		t2.move();
		t2.fuelType("Electric");
	}
}
