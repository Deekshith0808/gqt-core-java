package gqt375;
/**
 * @author sai deekshith
 */
class Animal29{
	String name;
	int age;
	public Animal29(String name,int age){
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
class Dog29 extends Animal29{
	String breed;
	public Dog29(String name,int age,String breed){
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
public class Program265{
	public static void main(String[] args){
		Animal29 myAnimal=new Animal29("Elephant",10);
		System.out.println("Accessing Animal Class Properties:");
		myAnimal.displayInfo();
		myAnimal.makeSound();
		System.out.println();
		Dog29 myDog=new Dog29("Buddy",3,"Golden Retriever");
		System.out.println("Accessing Dog Class Properties (including inherited ones):");
		myDog.displayDogInfo();
		myDog.makeSound();
	}
}
