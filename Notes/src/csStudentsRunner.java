
public class csStudentsRunner {
	public static void main(String[] args) {
		csStudents MrLu = new csStudents(); // prints "No name entered"
		MrLu = new csStudents("Mr. Lu", true);
		
		System.out.println(MrLu.getName()); // prints "Mr. Lu"
		System.out.println(MrLu.getPlaysGames()); // prints true
		System.out.println(MrLu.getMark()); // prints 0.0
		
		MrLu.setName("Alfred Lu");
		MrLu.setPlaysGames(false);
		MrLu.setMark(43.1);
		
		System.out.println(MrLu.getName()); // prints "Alfred Lu"
		System.out.println(MrLu.getPlaysGames()); // prints false
		System.out.println(MrLu.getMark()); // prints 43.1
		
		MrLu.badStudent(); // prints "This is a student."
		MrLu.setPlaysGames(true);
		MrLu.badStudent(); // prints "This is a bad student."
		
		System.out.println(MrLu.forgiveStudent()); // prints "Yell at student", then "false"
		MrLu.setMark(100);
		System.out.println(MrLu.forgiveStudent()); // prints "Let student play", then "true"
		
		System.out.println(MrLu.randomFail((int)(Math.random() * 2))); // answer could vary
		
		MrLu.setMark(12.0);
		MrLu.passStudent();
		System.out.println(MrLu.getMark()); // prints 50.0
		
		System.out.println(MrLu);
	}
}
