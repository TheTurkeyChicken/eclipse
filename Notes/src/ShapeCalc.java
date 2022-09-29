
public class ShapeCalc {
	private static int numTimesUsed = 0;
	
	String shape = "";
	
	public ShapeCalc() {
		numTimesUsed++;
	}
	public ShapeCalc(String shape) {
		numTimesUsed++;
	}
	
	public static void circleInfo(int radius) {
		System.out.println("C = " + (2 * 3.1415 * radius) + ", A = " + (3.1415 * radius * radius));
	}
	public static void rectangleInfo(int l, int w) {
		System.out.println("C = " + (2 * (l + w)) + ", A = " + (l * w));
	}
	public static void cylinderInfo(int r, int h, int w) {
		System.out.println("SA = " + (2 * 3.1415 * r * h + 2 * 3.1415 * r * r) + "V = " + (3.1415 * r * r * h));
	}
	public static int getNumTimesUsed() {
		return numTimesUsed;
	}
}
