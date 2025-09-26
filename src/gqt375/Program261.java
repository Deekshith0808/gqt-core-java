package gqt375;
/**
 * @author sai deekshith
 */
class Animal24{
	String name;
	int age;
	public Animal24(String name,int age){
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
class Dog24 extends Animal24{
	String breed;
	public Dog24(String name,int age,String breed){
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
public class Program261{
	public static void main(String[] args){
		Animal24 myAnimal=new Animal24("Elephant",10);
		System.out.println("Accessing Animal Class Properties:");
		myAnimal.displayInfo();
		myAnimal.makeSound();
		System.out.println();
		Dog24 myDog=new Dog24("Buddy",3,"Golden Retriever");
		System.out.println("Accessing Dog Class Properties (including inherited ones):");
		myDog.displayDogInfo();
		myDog.makeSound();
	}
}
