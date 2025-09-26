package gqt375;
/**
 * @author sai deekshith
 */
class Animal32{
	String name;
	int age;
	public Animal32(String name,int age){
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
class Dog32 extends Animal32{
	String breed;
	public Dog32(String name,int age,String breed){
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
public class Program269{
	public static void main(String[] args){
		Animal32 myAnimal=new Animal32("Elephant",10);
		System.out.println("Accessing Animal Class Properties:");
		myAnimal.displayInfo();
		myAnimal.makeSound();
		System.out.println();
		Dog32 myDog=new Dog32("Buddy",3,"Golden Retriever");
		System.out.println("Accessing Dog Class Properties (including inherited ones):");
		myDog.displayDogInfo();
		myDog.makeSound();
	}
}