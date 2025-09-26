package gqt375;
/**
 * @author sai deekshith
 */
class Program179 {
	private static int count = 0;
	public Program179() {
		count++;
	}
	public static int getCount() {
		return count;
	}
	public static void main(String[] args) {
		Program179 obj1 = new Program179();
		Program179 obj2 = new Program179();
		Program179 obj3 = new Program179();
		System.out.println("Number of objects created: " + Program179.getCount());
	}
}