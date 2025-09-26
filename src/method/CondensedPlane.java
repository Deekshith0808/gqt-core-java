package method;
class planee{
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
class CargoPlanee extends planee{
	@Override
	void fly() {
		System.out.println("CargoPlane flys at low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPlanee extends planee{
	@Override
	void fly() {
		System.out.println("PassengerPlane flys at medium heights");
	}
	void carryHumans() {
		System.out.println("PassengerPlane carry humans");
	}
}
class FighterPlanee extends planee{
	@Override
	void fly() {
		System.out.println("FighterPlane flys at higher heights");
	}
	void carryWepons() {
		System.out.println("FighterPlane carry wepons");
	}
}
class Airport{
	void permit(planee ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class CondensedPlane {

	public static void main(String[] args) {
		CargoPlanee cp = new CargoPlanee();
		PassengerPlanee pp = new PassengerPlanee();
		FighterPlanee fp = new FighterPlanee();
		Airport ap = new Airport();
		
		ap.permit(cp);		
		cp.carryGoods();
		System.out.println("------------");
		
		ap.permit(pp);
		pp.carryHumans();
		System.out.println("---------------");
		
		ap.permit(fp);;
		fp.carryWepons();
		System.out.println("---------------");
	}

}
