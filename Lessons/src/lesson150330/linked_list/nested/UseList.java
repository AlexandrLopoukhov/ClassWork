package lesson150330.linked_list.nested;

import java.util.Iterator;

public class UseList {
	public static void main(final String[] args) {
		LinkedList list = new LinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add(new Object());
		for (Object object : list) {
			System.out.println(object);

		}

	}
}
