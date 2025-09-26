package gqt375;
/**
 * @author sai deekshith
 */
abstract class Shape15{
	abstract double calculateArea();
	abstract double calculatePerimeter();
	public void display(){
		System.out.println("This is a shape.");
	}
}
class Circle15 extends Shape15{
	double radius;
	public Circle15(double radius){
		this.radius=radius;
	}
	double calculateArea(){
		return Math.PI*radius*radius;
	}
	double calculatePerimeter(){
		return 2*Math.PI*radius;
	}
	public void display(){
		System.out.println("This is a circle with radius: "+radius);
	}
}
class Rectangle15 extends Shape15{
	double length;
	double width;
	public Rectangle15(double length,double width){
		this.length=length;
		this.width=width;
	}
	double calculateArea(){
		return length*width;
	}
	double calculatePerimeter(){
		return 2*(length+width);
	}
	public void display(){
		System.out.println("This is a rectangle with length: "+length+" and width: "+width);
	}
}
public class Program240{
	public static void main(String[] args){
		Circle15 myCircle=new Circle15(5);
		myCircle.display();
		System.out.println("Area: "+myCircle.calculateArea());
		System.out.println("Perimeter: "+myCircle.calculatePerimeter());
		System.out.println();
		Rectangle15 myRectangle=new Rectangle15(4,6);
		myRectangle.display();
		System.out.println("Area: "+myRectangle.calculateArea());
		System.out.println("Perimeter: "+myRectangle.calculatePerimeter());
	}
}