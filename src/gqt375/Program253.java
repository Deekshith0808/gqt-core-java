package gqt375;
/**
 * @author sai deekshith
 */
class Animal21{
	String type;
	public Animal21(String type){
		this.type=type;
	}
	public void displayInfo(){
		System.out.println("Animal: Dog, Type: Mammal");
	}
}
class Dog21 extends Animal21{
	String breed;
	String color;
	public Dog21(String type,String breed,String color){
		super(type);
		this.breed=breed;
		this.color=color;
	}
	@Override
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Breed: "+breed+", Color: "+color);
	}
}
class Cat21 extends Animal21{
	String breed;
	String color;
	public Cat21(String type,String breed,String color){
		super(type);
		this.breed=breed;
		this.color=color;
	}
	@Override
	public void displayInfo(){
		System.out.println("Animal: Cat, Type: Mammal");
		System.out.println("Breed: "+breed+", Color: "+color);
	}
}
public class Program253{
	public static void main(String[] args){
		Dog21 dog=new Dog21("Mammal","Labrador","Golden");
		Cat21 cat=new Cat21("Mammal","Persian","White");
		dog.displayInfo();
		System.out.println();
		cat.displayInfo();
	}
}
