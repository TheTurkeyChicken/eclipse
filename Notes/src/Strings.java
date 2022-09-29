
public class Strings {
	public static void main(String[] args) {
		// Strings are objects
		// THey have helpful methods
		
		// To declare a String
		String str1 = new String("Adam");
		String str2 = "Jack";
		
		// To compare Strings we must use .equals()
		// do not use ==
		if(str1.equals(str2)) System.out.println("Same word");
		
		// Use .length() to get string length
		System.out.println(str1.length());
		
		// toUpperCase() and toLowerCase()
		
		System.out.println(str1.toUpperCase());
		
		// To join strings together, concatenate, use .concat
		System.out.println(str1.concat(str2));
		
		// TO test if a character of String is within a String
		// use infexOf()
		// Note: Strings begin with a 0
		// Returns -1 if not found
		
		System.out.println(str2.indexOf("c"));
		
		String str3 = "AllenHuHu";
		System.out.println(str3.indexOf("Hu"));
		System.out.println(str3.indexOf("Michael"));
		
		// substring
		// returns the string from (a, b)
		// a is inclusive, b is not
		String str4 = "Desmond";
		System.out.println(str4.substring(3, 6));
		
		// substring also takes 1 parameter
		// substring(a) returns from that index forward
		
		// To compare Strings, use compareTo
		String str5 = "emma";
		String str6 = "aamir";
		System.out.println(str6.compareTo(str5));
		// A negative number means str6 is alphabetically ahead of str5
		// Note: capital letters come before non-capital letters ie ...XYZabc...
		
		// Exercise 1
		// Print every letter in a word, letter by letter
		for(int i = 0; i < str4.length(); i++) System.out.println(str4.substring(i, i + 1));
		
		// Exercise 2
		// Print how many times "m" appears in Emma's name (str5)
		int numberofm = 0;
		for(int i = 0; i < str5.length(); i++) if(str5.substring(i, i + 1).equals("m")) numberofm++;
		System.out.println(numberofm);
		
		// Exercise 3
		// Take Allen's name (str3) and replace the "l" with "x" without using replace
		
		str3 = str3.replace("l", "x"); // don't use this
		for(int i = 0; i < str3.length(); i++) {
			if(str3.substring(i, i + 1).equals("l")) {
				str3 = str3.substring(0, i) + ("x") + (str3.substring(i + 1));
			}
		}
		System.out.println(str3);
		
		System.out.println("aaa".compareTo("aaa"));
	}
}
