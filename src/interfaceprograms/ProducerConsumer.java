package interfaceprograms;
class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
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
class Consumer extends Thread{
	Queue b;
	public Consumer (Queue q) {
		b=q;
	}
	@Override
	public void run() {
		while(true) {
			b.consume();
		}
	}
}
class Queue{
	int x;
	public void produce(int i) {
		x=i;
		System.out.println("Producer has produced the data : "+x);
	}
	public void consume() {
		System.out.println("Consumer has consumed the data : "+x);
	}
}
public class ProducerConsumer {
	public static void main(String[] args) {
		Queue q = new Queue();
		(new Producer(q)).start();//Producer p = new Producer();p.start()
		(new Consumer(q)).start();//Consumer c = new Consumer();p.start()

	}

}
