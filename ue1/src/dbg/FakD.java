package dbg;

public class FakD {

	public static int fak(int x) {
		int ergebnis = 0;
		for(int i = x; i >= 0; i--) {
			ergebnis = ergebnis * i;
		}
		return ergebnis;
	}

	public static void main(String[] args){
		System.out.println(fak(5));
	}

}
