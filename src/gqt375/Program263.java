package gqt375;
/**
 * @author sai deekshith
 */
class Animal26{
	String name;
	int age;
	public Animal26(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void displayInfo(){
		System.out.println("Animal Name: "+name);
		System.out.println("Age: "+age);
	}
	public void makeSound(){
		System.out.println(name+" makes a sound.");
	}
}
class Dog26 extends Animal26{
	String breed;
	public Dog26(String name,int age,String breed){
		super(name,age);
		this.breed=breed;
	}
	@Override
	public void makeSound(){
		System.out.println(name+" barks: Woof! Woof!");
	}
	public void displayDogInfo(){
		super.displayInfo();
		System.out.println("Breed: "+breed);
	}
}
public class Program263{
	public static void main(String[] args){
		Animal26 myAnimal=new Animal26("Elephant",10);
		System.out.println("Accessing Animal Class Properties:");
		myAnimal.displayInfo();
		myAnimal.makeSound();
		System.out.println();
		Dog26 myDog=new Dog26("Buddy",3,"Golden Retriever");
		System.out.println("Accessing Dog Class Properties (including inherited ones):");
		myDog.displayDogInfo();
		myDog.makeSound();
	}
}
