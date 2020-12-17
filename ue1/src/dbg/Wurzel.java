package dbg;

public class Wurzel {
	public
	static double wurzel(double x, double epsilon) {
		double fehler, y = x;
		do { 
			y = 0.5 * (y + x/y);
			if(x > y*y)
				fehler = x - y*y;
			else
				fehler = y*y - x;
		} while (fehler > epsilon);
		return y;
	}
	public static void main(String[] args) {
		System.out.println("Wurzel von 3.1415 ist " + wurzel(3.1415, 0.0001));
	}
}
