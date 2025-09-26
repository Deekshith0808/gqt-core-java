package gqt375;
/**
 * @author sai deekshith
 */

abstract class University {
	String name;
	University(String name) {
		this.name = name;
	}
	abstract void conductExam();
	void showInfo() {
		System.out.println("University Name: " + name);
	}
}
class EngineeringCollege extends University {
	EngineeringCollege(String name) {
		super(name);
	}
	@Override
	void conductExam() {
		System.out.println("Engineering exams are conducted online.");
	}
}
class MedicalCollege extends University {
	MedicalCollege(String name) {
		super(name);
	}
	@Override
	void conductExam() {
		System.out.println("Medical exams are conducted offline with practical sessions.");
	}
}
public class Program229 {
	public static void main(String[] args) {
		University enggCollege = new EngineeringCollege("ABC Institute of Technology");
		University medCollege = new MedicalCollege("XYZ Medical University");
		enggCollege.showInfo();
		enggCollege.conductExam();
		System.out.println();
		medCollege.showInfo();
		medCollege.conductExam();
	}
}
