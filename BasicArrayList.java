package DemoGeneric;

import java.util.ArrayList;
import java.util.Iterator;

public class BasicArrayList {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		// Add objects to arraylist
		list.add("Java");
		list.add("C++");
		list.add("PHP");
		list.add("Java");
		// Show list through Iterator
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ", ");
		}
		// Show list through for-each
		System.out.println();
		for (String obj : list) {
			System.out.print(obj + ", ");
		}
		// Show list through index
		System.out.println();
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.print(list.get(i) + ", ");
		}
	}
}
