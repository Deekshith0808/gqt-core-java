package gqt375;
/**
 * @author sai deekshith
 */
abstract class Animal13{
	abstract void eat();
	abstract void sleep();
}
class Dog13 extends Animal13{
	@Override
	void eat(){
		System.out.println("Dog is eating.");
	}
	@Override
	void sleep(){
		System.out.println("Dog is sleeping.");
	}
}
class Cat13 extends Animal13{
	@Override
	void eat(){
		System.out.println("Cat is eating.");
	}
	@Override
	void sleep(){
		System.out.println("Cat is sleeping.");
	}
}
public class Program236{
	public static void main(String[] args){
		Animal13 dog=new Dog13();
		Animal13 cat=new Cat13();
		dog.eat();
		dog.sleep();
		cat.eat();
		cat.sleep();
	}
}
