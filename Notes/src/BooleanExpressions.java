
public class BooleanExpressions {
	public static void main(String[] args) {
		// Boolean is either true or false
		
		// Boolean operators
		
		// &&: and (both have to be true)
		// ||: or  (only one has to be true)
		// ! : not (make opposite)
		
		// Example 1:
		System.out.println(true && false);
		
		int age = 14;
		int grade = 10;
		
		// Is a student 15 years old and in grade 10?
		System.out.println(age == 15 && grade == 10);
		
		// Is a student 15 years old or in grade 10?
		System.out.println(age == 15 || grade == 10);
		
		// Is a student between 14 and 17 years old (inclusive)?
		System.out.println(age >= 14 && age >= 17);
		
		double gpa = 89.5;
		
		/*A student is on the special senior honour roll if the student has an 86% average and higher, is in grade 11 or 12, and is between 16 and 18*/
		System.out.println((gpa >= 86) && (grade == 11 || grade == 12) && (age >= 16 && age <= 18));
		
		// Short circuit: if a first expression decides the outcome of the entire expression, Java will stop
	}
}
