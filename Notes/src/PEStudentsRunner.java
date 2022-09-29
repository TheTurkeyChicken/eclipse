import java.util.ArrayList;

public class PEStudentsRunner {
	public static void main(String[] args) {
		PEStudents justin = new PEStudents("Justin", 200);
		PEStudents edward = new PEStudents("Edward", 20000);
		PEStudents connor = new PEStudents("Cobber", 2000000);
		PEStudents joshua = new PEStudents("Joshua", 2000000000);
		PEStudents aaamir = new PEStudents("Aamir", 2);
		
		ArrayList<PEStudents> list = new ArrayList<PEStudents>();
		list.add(justin);
		list.add(edward);
		list.add(aaamir);
		list.add(connor);
		list.add(joshua);
		
		int wgtsum = 0;
		for(int i = 0; i < list.size(); i++) {
			wgtsum += list.get(i).getBenchPress();
		}
		double avg = (double)(wgtsum / list.size());
		
		String someperson = "Justin";
		boolean isFound = false;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(someperson)) {
				System.out.println(list.get(i).getName() + " " + list.get(i).getBenchPress());
				isFound = true;
			}
		}
		if(!isFound) System.out.println("not found");
		
		wgtsum = 0;
		for(int i = 0; i < list.size(); i++) {
			wgtsum += list.get(i).getBenchPress() + 5;
		}
		avg = (double)(wgtsum / list.size());

	}
}
