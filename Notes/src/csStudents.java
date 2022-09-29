
public class csStudents {
	String firstName;
	boolean playsGamesinClass;
	double mark;
	
	public csStudents() {
		System.out.println("No name entered.");
	}
	
	public csStudents(String name, boolean playsGames) {
		firstName = name;
		playsGamesinClass = playsGames;
	}
	
	public String getName() {
		return firstName;
	}
	public boolean getPlaysGames() {
		return playsGamesinClass;
	}
	public double getMark() {
		return mark;
	}
	public void setName(String newName) {
		firstName = newName;
	}
	public void setPlaysGames(boolean newBool) {
		playsGamesinClass = newBool;
	}
	public void setMark(double newMark) {
		mark = newMark;
	}
	
	public void badStudent() {
		if(playsGamesinClass) System.out.println("This is a bad student");
		else System.out.println("This is a student");
	}
	
	public boolean forgiveStudent() {
		if(mark >= 99 && playsGamesinClass == true) {
			System.out.println("Let student play.");
			return true;
		}
		else {
			System.out.println("Yell at student.");
			return false;
		}	
	}
	
	public String randomFail(int studentNumber) {
		if(studentNumber % 2 == 1) return "Fail";
		return "No Fail";
	}
	
	public void passStudent() {
		if(mark < 50) mark = 50;
	}
	
	public String toString() {
		return firstName;
	}
}
