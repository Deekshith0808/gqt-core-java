package gqt375;
/**
 * @author sai deekshith
 */
abstract class Instrument {
	abstract void playSound();
	void tune() {
		System.out.println("Tuning the instrument...");
	}
}
class Guitar extends Instrument {
	@Override
	void playSound() {
		System.out.println("Strumming the guitar: Twangtwang!");
	}}
class Drums extends Instrument {
	@Override
	void playSound() {
		System.out.println("Beating the drums: Boomboom!");
	}}
class Flute extends Instrument {
	@Override
	void playSound() {
		System.out.println("Blowing the flute: Toottoot!");
	}
}
public class Program221 {
	public static void main(String[] args) {
		Instrument guitar = new Guitar();
		Instrument drums = new Drums();
		Instrument flute = new Flute();
		guitar.tune();
		guitar.playSound();
		System.out.println();
		drums.tune();
		drums.playSound();
		System.out.println();
		flute.tune();
		flute.playSound();
	}
}
