package interfaceprograms;
class Producer1 extends Thread{
	Queue1 a;
	public Producer1(Queue1 q) {
		a=q;
	}
	@Override
	public void run() {
		int i =1;
		while(true) {
			a.produce(i++);
		}
	}
}
class Consumer1 extends Thread{
	Queue1 b;
	public Consumer1 (Queue1 q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
			b.consume();
		}
	}
}
class Queue1{
	int x;
	boolean value_inside_x=false;
	synchronized public void produce(int i) {
		try {
			if(value_inside_x == false) {
				x=i;
				System.out.println("Producer has produced the data :"+x);
				value_inside_x = true;
				notify();
			}
			else {
				wait();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	synchronized public void consume(){
		try {
			if(value_inside_x == true) {
				
				System.out.println("Consumer has consumed the data :"+x);
				value_inside_x = false;
				notify();
			}
			else {
				wait();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class ProducerConsumer1 {
	public static void main(String[] args) {
		Queue1 q = new Queue1();
		(new Producer1(q)).start();//Producer p = new Producer();p.start()
		(new Consumer1(q)).start();//Consumer c = new Consumer();p.start()

	}
}