package gen;

public class GenUtils<T> {
	
	public static <T> void printArray(T[] field) {
		for (T a : field) {
			System.out.print(a);
		}
	}
	
	public static <T> void swap(T[] field, int index1, int index2) {
		T help = field[index1];
		field[index1] = field[index2];
		field[index2] = help;
	}
	
	public static <T extends KeyHolder> void bubbleSort(T[] field) {
		for(int i=0; i<field.length-1; i++) {
			for(int j=0; j<field.length-1; j++) {
				if(field[j].getKey()>field[j+1].getKey()) {
					GenUtils.swap(field, j, j+1);
				}
			}
		}
	}
	
	public static <T> int countIf(T[] field, Predicate<T> obj) {
		int counter=0;
		for(T a : field) {
			if(obj.test(a)) {
				counter++;
			}
		}
		return counter;		
	}
	
	public static void main(String[] args) {
		Person[] people = new Person[4];
		
		people[0] = new Person("Helga", 24);
		people[1] = new Person("Horst", 5);
		people[2] = new Person("Reus", 14);
		people[3] = new Person("Big Shaq", 99);
		
		GenUtils.bubbleSort(people);
		
		for(Person a : people) {
			System.out.println(a.toString());
		}
		
		Double[] doubleArray = {1.0, -0.5, 3.7, 6.2, -999.999};
		Integer[] intArray = {-1000, 0 , 1000};
		int counter = countIf(doubleArray, new PositiveP());
		int intNum = countIf(intArray, new PositiveP());
		int negativeNum = doubleArray.length-counter;
		System.out.println("Anzahl der positiven Double Zahlen: "+counter+"\nAnzahl der negativen Double Zahlen: "+Integer.toString(negativeNum));
		System.out.println("Positive Integer Zahlen: "+intNum);
	}
}
