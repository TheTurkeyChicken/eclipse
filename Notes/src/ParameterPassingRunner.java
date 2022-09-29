
public class ParameterPassingRunner {
	public static void main(String[] args) {
		ParameterPassing p = new ParameterPassing();
		int[] arr = {1, 2, 3};
		
		int b = 2;
		p.changer(b, arr);
		System.out.println(b);
		System.out.println(arr[0]);
	}
}
