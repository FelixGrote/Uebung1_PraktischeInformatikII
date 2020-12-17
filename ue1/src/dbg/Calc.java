package dbg;

public class Calc {
		static double a = 23;
		static double b = 42;
		static double c = 3.14;
		static double d = 1.62;

	public static void main(String[] args) {


		d = b*c;
		c = Math.pow(d,2);
		a = 13 * b;
		b = Math.floor(d);
		c = d % 5;
		a = Math.exp(b++);
		b = Math.tan(a);
		d = Math.log(Math.abs(b));
		c = d - c;
		a = -Math.pow(-d,1/3.0);
		c = a*b+c*d;
		b = c*a+d;
		d = (d*a)/(b*c);
		a = Math.sqrt(d*b);
		d = c*b;
		b = Math.floor(d*a);

		//TODO Welchen Wert hat c nach Ausführung dieser Zeile?
		c = b*5.75;

		d = Math.sin(b/c);
		a = a*c*d*1;

		//TODO Welchen Wert hat d nach Ausführung dieser Zeile?
		d = Math.floor(d * 247);

		b = b*Math.abs(c);	
		d = Math.log(Math.abs(b));
		b = Math.floor(d);
		a = Math.exp(b++);
		c = Math.tan(a);
		d = Math.log(Math.abs(b));
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}

