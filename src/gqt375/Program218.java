package gqt375;
/**
 * @author sai deekshith
 */
abstract class Figure {
	abstract void draw();
	abstract void erase();
}
class Rectangle4 extends Figure {
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle.");
	}
	@Override
	public void erase() {
		System.out.println("Erasing the Rectangle.");
	}
}
class Circle4 extends Figure {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle.");
	}
	@Override
	public void erase() {
		System.out.println("Erasing the Circle.");
	}
}
public class Program218 {
	public static void main(String[] args) {
		Figure rectangle = new Rectangle4();
		Figure circle = new Circle4();
		rectangle.draw();
		rectangle.erase();
		circle.draw();
		circle.erase();
	}
}
