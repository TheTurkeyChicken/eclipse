
public class ShapeCalcRunner {
	public static void main(String[] args ) {
		ShapeCalc foo = new ShapeCalc();
		System.out.println(ShapeCalc.getNumTimesUsed());
		ShapeCalc rectangle = new ShapeCalc("rectangle");
		System.out.println(ShapeCalc.getNumTimesUsed());
		
		rectangle.rectangleInfo(3, 4);
		ShapeCalc.cylinderInfo(4, 8, 3);
		ShapeCalc.circleInfo(3);
		
		System.out.println(ShapeCalc.getNumTimesUsed());
	}
}
