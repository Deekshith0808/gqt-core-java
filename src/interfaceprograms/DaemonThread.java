package interfaceprograms;

// DAEMON 

class MicrosoftWord1 extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if(Thread.currentThread().getName().equals("checking")) {
			checking();
		}
		else {
			saving();
		}

	}

	public void typing() {
		try {
			for(int i=1; i<=5;i++) {
				System.out.println("Typing in progress...");
				Thread.sleep(2000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}


	public void checking() {
		try {
			for(int i=1; i<=5;i++) {
				System.out.println("Checking in progress...");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}



	public void saving() {
		try {
			for(int i=1; i<=5;i++) {
				System.out.println("Saving in progress...");
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}


public class DaemonThread {
	public static void main(String[] args) {
		MicrosoftWord ms1 = new MicrosoftWord();
		ms1.setName("typing");
		MicrosoftWord ms2 = new MicrosoftWord();
		ms2.setName("checking");
		ms2.setPriority(8);
		ms2.setDaemon(true);
		MicrosoftWord ms3 = new MicrosoftWord();
		ms3.setName("saving");
		ms3.setPriority(9);
		ms3.setDaemon(true);
		System.out.println(ms1);
		System.out.println(ms2);
		System.out.println(ms3);
		ms1.start();
		ms2.start();
		ms3.start();
	}

}




