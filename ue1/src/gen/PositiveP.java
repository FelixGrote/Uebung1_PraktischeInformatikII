package gen;

public class PositiveP implements Predicate<Number>{
	public boolean test(Number zahl) {
		boolean pruefer = zahl.doubleValue() > 0;
		return pruefer;
	}
}
