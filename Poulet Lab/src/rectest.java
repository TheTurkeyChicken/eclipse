
public class rectest {
	public static int mystery(int x) {
		if(x <= 1) {
			return 1;
		}
		else {
			return 2 * mystery(x - 2);
		}
	}
	public static void main(String[] args) {
	System.out.println(mystery(10));
	}
}
