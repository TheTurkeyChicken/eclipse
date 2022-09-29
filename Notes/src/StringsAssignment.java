import java.util.Scanner;

public class StringsAssignment {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Print length of word "Computer"
		System.out.println("Computer".length());
		
		// Concatenate words "hello" and "world"
		System.out.println("Hello".concat("World"));
		
		// Capitalize the word "hello"
		System.out.println("hello".toUpperCase());
		
		// Given two strings, print out which string comes first alphabetically, or if they are equal
		String str1 = "abcde", str2 = "abcde";
		int comp = str1.compareTo(str2);
		if(comp == 0) System.out.println("Equal");
		else if(comp < 0) System.out.println("str1");
		else System.out.println("str2");
		
		// Take "Hello" from "HelloWorld"
		String hw = "HelloWorld";
		System.out.println(hw.substring(0, 5));
		
		// Take "loWo" from "HelloWorld"
		System.out.println(hw.substring(3, 7));
		
		// Take "World" from "HelloWorld"
		System.out.println(hw.substring(5));
		
		// Determine if "cde" is in "abcdefgh"
		int result = "abcdefgh".indexOf("cde");
		if(result == -1) System.out.println("Not found");
		else System.out.println("Found");
		
		// Determine how many times "aaa" appears in "aaabbbaaacccaaa"
		String str9 = "aaabbbaaacccaaa";
		int nextoc, counter = 0;
		while(true) {
			nextoc = str9.indexOf("aaa");
			if(nextoc == -1)
				break;
			str9 = str9.substring(nextoc + 3);
			counter++;
		}
		System.out.println(counter);
		
		// Ask user for two words, then an index within the first word, and place the second word at that index
		String word1 = scan.nextLine(), word2 = scan.nextLine();
		int insert = scan.nextInt() + 1;
		System.out.println(word1.substring(0, insert) + word2 + word1.substring(insert));
		
		// Ask for letter and word, print the number of occurences of that letter
		scan.nextLine(); // consume \n
		String letter = scan.nextLine(), word = scan.nextLine() + " ";
		counter = 0;
		nextoc = word.indexOf(letter);
		while(nextoc != -1) {
			word = word.substring(0, nextoc) + word.substring(nextoc + 1);
			counter++;
			nextoc = word.indexOf(letter);
		}
		System.out.println(counter);
		
		// Given a string and a letter, remove every instance of the letter from the string
		word = scan.nextLine() + " "; letter = scan.nextLine();
		nextoc = word.indexOf(letter);
		while(nextoc != -1) {
			word = word.substring(0, nextoc) + word.substring(nextoc + 1);
			nextoc = word.indexOf(letter);
		}
		System.out.println(word);
		
	}
}
