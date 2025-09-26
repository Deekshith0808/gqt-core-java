package gqt375;
/**
 * @author sai deekshith
 */

class Animal28{
	String name;
	int age;
	public Animal28(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void displayInfo(){
		System.out.println("Animal Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Dog28 extends Animal28{
	String breed;
	public Dog28(String name,int age,String breed){
		super(name,age);
		this.breed=breed;
	}
	public void displayDogInfo(){
		displayInfo();
		System.out.println("Breed: "+breed);
		System.out.println(name+" barks: Woof! Woof!");
	}
}
class Cat28 extends Animal28{
	String color;
	public Cat28(String name,int age,String color){
		super(name,age);
		this.color=color;
	}
	public void displayCatInfo(){
		displayInfo();
		System.out.println("Color: "+color);
		System.out.println(name+" meows: Meow! Meow!");
	}
}
public class Program264{
	public static void main(String[] args){
		Dog28 myDog=new Dog28("Buddy",3,"Golden Retriever");
		System.out.println("Dog Details:");
		myDog.displayDogInfo();
		System.out.println();
		Cat28 myCat=new Cat28("Whiskers",2,"White");
		System.out.println("Cat Details:");
		myCat.displayCatInfo();
	}
}