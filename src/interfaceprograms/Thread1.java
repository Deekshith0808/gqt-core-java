//THREAD

package interfaceprograms;

public class Thread1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t1 = new Thread();
		System.out.println(t1);
		t1.setName("Samantha");
		t1.setPriority(2);
		System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
	}

}
