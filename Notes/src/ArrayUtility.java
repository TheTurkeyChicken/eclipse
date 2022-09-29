import java.util.Arrays;

public class ArrayUtility {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		int[] arr3 = {0, 1, 2};
		
		System.out.println(Arrays.equals(arr1, arr2));
		Arrays.sort(arr2);
		
		Arrays.fill(arr2,  -2);
		
//		Arrays.copyOf(arr3, arr2);
		
		
	}
}
