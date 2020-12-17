
public class ObjektBehaelter<T> {
	private T inhalt;
	private static int counter = 0;
	private final int KEY;
	
	public ObjektBehaelter(T o) {
		this.inhalt = o;
		this.counter += 1;
		this.KEY = this.counter;
	}
	
	public T getInhalt() {
		return this.inhalt;
	}
	public int getKey() {
		//return this.key;
		return this.KEY;
	}
	public void setInhalt(T o) {
		this.inhalt = o;
//		this.key = key; AUF BLATT SCHREIBEN, ACCES IN STATIC WAY
	}
	public String toString() {
		return "("+String.valueOf(this.KEY)+","+this.inhalt.toString()+")";
	}
}
