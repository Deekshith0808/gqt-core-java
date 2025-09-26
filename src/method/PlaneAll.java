package method;
class plane1{
	void takeOff() {
		System.out.println("Plane took off");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plane lands");
	}
}
class CargoPlane1 extends plane{
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPlane1 extends plane{
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium heights");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry humans");
	}
}
class FighterPlane1 extends plane{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at higher heights");
	}
	void carryWepons() {
		System.out.println("FighterPlane carry wepons");
	}
}

public class PlaneAll {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		plane ref;
		
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		cp.carryGoods();
		System.out.println("------------");
		
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		pp.carryHumans();
		System.out.println("---------------");
		
		ref=fp;
		ref.takeOff();
		ref.fly();
		ref.land();
		fp.carryWepons();
		System.out.println("---------------");
	}

}
















