import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("dog");
		list.add("bird");
		list.add("mouse");
		list.add("elephant");
		
		list.add(2, "fish");
		list.set(4, "pig");
		list.remove(1);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		PEStudents ian = new PEStudents("Ian", 215);
		PEStudents desmond = new PEStudents("Desmond", 100);
		PEStudents connor = new PEStudents("Connor", 185);
		PEStudents jack = new PEStudents("Jack", 155);
		PEStudents weakling = new PEStudents("EdwardG", 0);
		
		ArrayList<PEStudents> pelist = new ArrayList<PEStudents>();
		pelist.add(ian);
		pelist.add(desmond);
		pelist.add(connor);
		pelist.add(jack);
		pelist.add(weakling);
		
		int sum = 0;
		for(int i = 0; i < pelist.size(); i++) {
			sum += pelist.get(i).getBenchPress();
		}
		double avg = (double)sum / pelist.size();
		System.out.println("Average is: " + avg);
	}
}
