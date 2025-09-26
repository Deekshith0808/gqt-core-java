package gqt375;
/**
 * @author sai deekshith
 */
class Animal14{
	String name;
	int age;
	public Animal14(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void displayInfo(){
		System.out.println("Animal Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Dog14 extends Animal14{
	String breed;
	public Dog14(String name,int age,String breed){
		super(name,age);
		this.breed=breed;
	}
	public void displayDogInfo(){
		displayInfo();
		System.out.println("Breed: "+breed);
		System.out.println(name+" barks: Woof! Woof!");
	}
}
class Cat14 extends Animal14{
	String color;
	public Cat14(String name,int age,String color){
		super(name,age);
		this.color=color;
	}
	public void displayCatInfo(){
		displayInfo();
		System.out.println("Color: "+color);
		System.out.println(name+" meows: Meow! Meow!");
	}
}
public class Program242{
	public static void main(String[] args){
		Dog14 myDog=new Dog14("Buddy",3,"Golden Retriever");
		System.out.println("Dog Details:");
		myDog.displayDogInfo();
		System.out.println();
		Cat14 myCat=new Cat14("Whiskers",2,"White");
		System.out.println("Cat Details:");
		myCat.displayCatInfo();
	}
}
