package lesson150330.linked_list;

import java.util.Iterator;

public class UseList {
	public static void main(final String[] args) {
		LinkedList list = new LinkedList();
		list.print();
		list.add("one");
		list.add("two");
		list.add("three");
		// list.print();
		for (Object object : list) {
			System.out.println(object);

		}

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
