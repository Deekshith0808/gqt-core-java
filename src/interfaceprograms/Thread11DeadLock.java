package interfaceprograms;
//Deadlock:
class Warrior1 extends Thread{
	String res1 = "AK-47";
	String res2 = "9mm";
	String res3 = "SMG";
	
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("karthi")) {
			karthiAcq();
		}
		else {
			maheshAcq();
		}
	}

	private void karthiAcq() {
		try {
			synchronized (res1) {
				System.out.println("Karthi Has Acquired : "+res1);
				Thread.sleep(4000);
				synchronized (res2) {
					System.out.println("Karthi Has Acquired : "+res2);
					Thread.sleep(4000);
					synchronized (res3) {
						System.out.println("Karthi Has Acquired : "+res3);
						Thread.sleep(4000);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void maheshAcq() {
		try {
			synchronized (res3) {
				System.out.println("Mahesh Has Acquired : "+res3);
				Thread.sleep(4000);
				synchronized (res2) {
					System.out.println("Mahesh Has Acquired : "+res2);
					Thread.sleep(4000);
					synchronized (res1) {
						System.out.println("Mahesh Has Acquired : "+res1);
						Thread.sleep(4000);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Thread11DeadLock {
	public static void main(String[] args) {
		Warrior1 w1 = new Warrior1();
		w1.setName("karthi");
		Warrior1 w2 = new Warrior1();
		w2.setName("mahesh");
		
		w1.start();
		w2.start();
	}
}


