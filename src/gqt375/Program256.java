package gqt375;
/**
 * @author sai deekshith
 */
class Animal23 {
	String name;
	String type;
	void showAnimalDetails() {
		System.out.println("Animal Name: " + name);
		System.out.println("Animal Type: " + type);
	}
}
class Dog23 extends Animal23 {
	String breed;
	String color;
	void showDogDetails() {
		showAnimalDetails();
		System.out.println("Breed: " + breed);
		System.out.println("Color: " + color);
	}
}
class Cat23 extends Animal23 {
	String breed;
	String color;
	void showCatDetails() {
		showAnimalDetails();
		System.out.println("Breed: " + breed);
		System.out.println("Color: " + color);
	}
}
public class Program256
 {
	public static void main(String[] args) {
		Dog23 dog = new Dog23();
		dog.name = "Buddy";
		dog.type = "Domestic";
		dog.breed = "Labrador";
		dog.color = "Golden";
		System.out.println("=== Dog Details ===");
		dog.showDogDetails();
		System.out.println();
		Cat23 cat = new Cat23();
		cat.name = "Whiskers";
		cat.type = "Domestic";
		cat.breed = "Persian";
		cat.color = "White";
		System.out.println("=== Cat Details ===");
		cat.showCatDetails();
	}
}