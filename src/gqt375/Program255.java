package gqt375;
/**
 * @author sai deekshith
 */
class Shape23{
	String type;
	String color;
	public Shape23(String type,String color){
		this.type=type;
		this.color=color;
	}
	public void displayInfo(){
		System.out.println("Type: "+type+", Color: "+color);
	}
}
class Rectangle23 extends Shape23{
	double length;
	double width;
	public Rectangle23(String type,String color,double length,double width){
		super(type,color);
		this.length=length;
		this.width=width;
	}
	@Override
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Length: "+length+", Width: "+width);
	}
}
public class Program255{
	public static void main(String[] args){
		Rectangle23 rectangle=new Rectangle23("Rectangle","Blue",10.5,5.0);
		rectangle.displayInfo();
	}
}
