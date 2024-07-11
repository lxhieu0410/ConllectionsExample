package DemoGeneric;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

class CollentionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("PHP");
		arrayList.add("Python");
		arrayList.add("Java");
		arrayList.add("C++");
		System.out.println("Các phần tử của ArrayList");
		System.out.print("\t" + arrayList + "\n");

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("PHP");
		linkedList.add("Python");
		linkedList.add("Java");
		linkedList.add("C++");
		System.out.println("Các phần tử của LinkedList");
		System.out.print("\t" + linkedList + "\n");

		// new TreeSet() sẽ sắp xếp các phần tử
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("PHP");
		hashSet.add("Python");
		hashSet.add("Java");
		hashSet.add("C++");
		System.out.println("Các phần tử của Set");
		System.out.print("\t" + hashSet + "\n");

		// new TreeMap() sẽ sắp xếp các phần tử dự vào key của chúng
		Map<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Windows", "10");
		hashMap.put("Windows", "11");
		hashMap.put("Language2", "Java");
		hashMap.put("Language1", ".Net");
		System.out.println("Các phần tử của Map");
		System.out.print("\t" + hashMap);
	}

}
