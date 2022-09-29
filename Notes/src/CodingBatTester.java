
public class CodingBatTester {
	public static int countCode(String str) {
		  int nextoc, counter  = 0;
		  while(true) {
		    nextoc = str.indexOf("co");
		    if(nextoc == -1 || nextoc >= str.length() - 4) break; 
		    if(str.substring(nextoc + 2, nextoc + 3) == "e") {
		      counter++;
		      str = str.substring(nextoc + 4);
		      System.out.println("eee");
		    }
		  }
		  return counter;
		}
	public static void main(String[] args) {
		System.out.println(countCode("aaacodebbb"));
	}
}
