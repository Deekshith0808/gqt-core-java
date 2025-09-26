package abstraction;

abstract class plane{
	abstract void takeOff();
	abstract void fly();
	void land() {
		System.out.println("Plane lands");
	}
}
class CargoPlane extends plane{
	@Override
	void fly() {
		System.out.println("cragoPlane flys in low heights");
	}
	@Override
	void takeOff() {
		System.out.println("Cargo pplane require long runway to takeoff");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}


class PassengerPalne extends plane{
	@Override
	void fly() {
		System.out.println("PassergerPlane flys in medium plane");
		
	}
	@Override
	void takeOff() {
		System.out.println("Passenger plane require medium runway to takeoff");
	}
	void carryHumans() {
		System.out.println("Passenger plane carry Humans");
	}
}
class FighterPlane extends plane{
	@Override
	void fly() {
		System.out.println("Fighter Plane flys in great Heights");
	}
	@Override
	void takeOff() {
		System.out.println("Fighter plane require short runway");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
	
}


public class AbstractionAnimal {

	public static void main(String[] args) {
//		plane p=new plane();
		CargoPlane cp=new CargoPlane();
		PassengerPalne pp=new PassengerPalne();
		FighterPlane fp=new FighterPlane();
		
		cp.takeOff();
		cp.fly();
		cp.carryGoods();
		cp.land();
		System.out.println("-------------------------------------");
		pp.takeOff();
		pp.fly();
		pp.carryHumans();
		pp.land();
		System.out.println("-------------------------------------");
		fp.takeOff();
		fp.carryWeapons();
		fp.fly();
		fp.land();
		System.out.println("--------------------------------------");
		
		plane p1= new plane() {

			@Override
			void takeOff() {
				System.out.println("takeoff");
				
			}

			@Override
			void fly() {
				System.out.println("flys");
				
			}
		
	};
	
	p1.takeOff();
	p1.fly();
	p1.land();

}
}


