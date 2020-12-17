
public class TestObjektBehaelter {
	public static void main(String[] args) {
		ObjektBehaelter<String> obj1 = new ObjektBehaelter<String>("Hallo");
		ObjektBehaelter<Double> obj2 = new ObjektBehaelter<Double>(5.543);
		System.out.println(obj1.toString()+"\n"+obj2.toString());
	}
}
