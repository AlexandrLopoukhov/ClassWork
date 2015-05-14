package lesson150427.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleCollectionsExamples {
<<<<<<< HEAD
	public static void main(final String[] args) {
		List<String> list = new ArrayList<>();

		list.add("one");
		list.add("two");
		list.add("three");
		Collections.reverse(list);
		System.out.println(list);

		Collections.rotate(list, -1);
		System.out.println(list);
	}
=======
	
	public static void main(final String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.rotate(list, -1);
		
		System.out.println(list);
		
		
	}

>>>>>>> refs/remotes/zaal/master
}
