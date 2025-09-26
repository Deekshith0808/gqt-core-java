package interfaceprograms;
class Human extends Thread{
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the restroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the restroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" has exited the restroom");
			Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Join {
	public static void main(String[] args) {
		Human h1 = new Human();
		h1.setName("Man");
		Human h2 = new Human();
		h2.setName("Women");
		Human h3 = new Human();
		h3.setName("Others");
		h1.start();
		h2.start();
		h3.start();
	}

}
