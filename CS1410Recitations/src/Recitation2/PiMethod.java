package Recitation2;

/**
 * @author wiese
 *
 */
public class PiMethod {
	
	
	/**
	 * Computes the area of a circle.
	 * 
	 * @param radius
	 * @return
	 */
	public static double piMeth1(double radius) {
		double area = 0;
		if(radius >= 0) {
			area = 3.14 * radius * radius;
		} 
		return area;
	}
	
	public static double piMeth2(double radius) {
		if(radius >= 0) {
			return 3.14 * radius * radius;
		} 
		return 0.0;
	}
	
	public static double piMeth3(double radius) {
		if(radius >= 0) {
			return 3.14 * radius * radius;
		} 
		return 0.0;
	}
	
	public static void main(String[] Args) {
		System.out.println("Testing piMeth(): " + piMeth1(100));
	}
}
